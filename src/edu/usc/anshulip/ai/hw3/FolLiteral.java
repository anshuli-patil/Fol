package edu.usc.anshulip.ai.hw3;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines Literal - Atomic part of a FOL logic 
 * @author anshulip
 *
 */
public class FolLiteral {
	
	boolean isPositive;
	String name;
	List<FolPredicate> predicates;

	FolLiteral(boolean isPositive, String name, List<FolPredicate> predicates) {
		this.isPositive = isPositive;
		this.name = name;
		this.predicates = predicates;
	}

	FolLiteral(String literal) {
		if (literal.charAt(0) == Constants.NOT) {
			this.isPositive = false;
			literal = literal.substring(1);
		} else {
			this.isPositive = true;
		}

		this.name = literal.substring(0, literal.indexOf(Constants.OPENING_BRACE));
		// literal = StringUtils.substringBetween(literal,"(",")");
		literal = literal.substring(literal.indexOf(Constants.OPENING_BRACE) + 1, literal.length() - 1);

		List<String> rawPredicateList = Arrays.asList(literal.split(Constants.LITERAL_SEPERATOR));
		this.predicates = FolPredicate.getPredicates(rawPredicateList);
	}

	@Override
	public String toString() {
		if (isPositive) {
			return (String.format("%s%s", name, predicates));
		} else {
			return (String.format("%c%s%s", Constants.NOT, name, predicates));
		}
	}
	
	/**
	 * unifies two literals
	 * @param p literal #1
	 * @param q literal #2
	 * @param theta partial substitution map
	 * @return a list of substitutions to unify l1 and l2, null if failure to unify
	 */
	private static Map<String, String> unify(FolLiteral p, FolLiteral q, Map<String, String> theta) {
		 
		if (!p.name.equals(q.name) || p.predicates.size() != q.predicates.size()) {
				//|| p.isPositive == q.isPositive) {
			return null;
		}
		//r and s be the terms in p and q, respectively, where disagreement first occurs
		FolPredicate r = null;
		FolPredicate s = null; 

		for (int i = 0; i < p.predicates.size(); i++) {
			FolPredicate predicate1 = p.predicates.get(i);
			FolPredicate predicate2 = q.predicates.get(i);

			if(predicate1.value.equals(predicate2.value)) {
				continue;
			} else {
				r = predicate1;
				s = predicate2;
				break;
			}
		}
		// p & q are exactly the same
		if(r == null) {
			return theta;
		}
		
		if(!r.isGroundTerm) {
			theta.put(r.value, s.value);
			return unify(substitution(theta, p), substitution(theta, q), theta);
		} else if(!s.isGroundTerm) {
			theta.put(s.value, r.value);
			return unify(substitution(theta, p), substitution(theta, q), theta);
		} else {
			return null;
		}
	 }
	
	private static FolLiteral substitution(Map<String, String> theta, FolLiteral p) {
		for(int i = 0; i < p.predicates.size(); i++) {
			if(theta.containsKey(p.predicates.get(i).value)) {
				FolPredicate original = p.predicates.get(i);
				p.predicates.remove(i);
				
				String value = theta.get(original.value);
				FolPredicate replacement = new FolPredicate(value, original.isGroundTerm);
				//p.predicates.add(replacement);
				//System.out.println("Replacement = "+replacement+" and value = "+value);
				p.predicates.add(i, replacement);
			}
		}
		//System.out.println("After substitution :"+p);
		return p;
	}

	public static Map<String, String> unify(FolLiteral l1, FolLiteral l2) {
		return FolLiteral.unify(l1, l2, new HashMap<String, String>());
	}
	
	public static void main(String[] args) {
		//System.out.println("~Animal[x, Aardvark, z]".indexOf(Constants.OPENING_BRACE));
		//System.out.println(new FolLiteral("~Animal[x, Aardvark, z]"));
		/*
		System.out.println(FolLiteral.unify(new FolLiteral("parents[x,B,A]"), new FolLiteral("parents[z,y,z]"),
				new HashMap<String, String>()));
		*/
		
	}
}
