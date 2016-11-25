package edu.usc.anshulip.ai.hw3;


import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * FolSentence is of type folLiteral_1 'or' folLiteral_2 ....... 'or'
 * folliteral_n
 * 
 * @author anshulip
 *
 */
public class FolSentence {
	Map<String, FolLiteral> literals;

	FolSentence(String sentence) {
		literals = new HashMap<String, FolLiteral>();

		String[] rawLiterals = sentence.split(Pattern.quote(Character.toString(Constants.OR)));
		
		for (int i = 0; i < rawLiterals.length; i++) {
			FolLiteral folLiteral = new FolLiteral(rawLiterals[i]);
			literals.put(folLiteral.name, folLiteral);
		}
	}

	FolSentence(Map<String, FolLiteral> literals) {
		this.literals = literals;
	}

	/**
	 * 
	 * @param p the FOL sentences we want to unify #1
	 * @param q Sentence #2
	 * @param literalType the unifying literal value/label
	 * @return FolSentence by applying resolution procedure on sentences p & q, or null if impossible to resolve
	 */
	public static FolSentence applyResolution(FolSentence p, FolSentence q, String literalType) {
		FolLiteral l1 = p.getLiteral(literalType);
		FolLiteral l2 = q.getLiteral(literalType);
		
		Map<String, String> unifySubstitution = FolLiteral.unify(l1, l2);

		if (unifySubstitution == null) {
			return null;
		}

		Map<String, FolLiteral> newLiterals = new HashMap<String, FolLiteral>();
		newLiterals.putAll(substituteAll(p, literalType, unifySubstitution));
		newLiterals.putAll(substituteAll(q, literalType, unifySubstitution));

		FolSentence combinedSentence = new FolSentence(newLiterals);
		System.out.println(combinedSentence);
		return combinedSentence;
	}

	private static Map<String, FolLiteral> substituteAll(FolSentence sentence, String unifyingLiteral,
			Map<String, String> unifySubstitution) {
		Map<String, FolLiteral> newLiterals = new HashMap<String, FolLiteral>();

		sentence.literals.remove(unifyingLiteral);

		for (Map.Entry<String, FolLiteral> entry : sentence.literals.entrySet()) {
			String literalName = entry.getKey();
			FolLiteral literalDescription = entry.getValue();

			newLiterals.put(literalName, substitute(literalDescription, unifySubstitution));
		}
		return newLiterals;
	}

	// TODO verify
	private static FolLiteral substitute(FolLiteral literal, Map<String, String> unifySubstitution) {
		
		for(FolPredicate p : literal.predicates) {
			if(unifySubstitution.containsKey(p.value)) {
				p.value = unifySubstitution.get(p.value);
			}
		}
		return literal;
	}

	// return true if sentences are contradicting each other
	static boolean isContradiction(FolSentence sentence1, FolSentence sentence2) {
		if (sentence1.literals.keySet().size() == 1 && sentence2.literals.keySet().size() == 1) {

			FolLiteral literalSentence1 = null, literalSentence2 = null;
			for (Map.Entry<String, FolLiteral> entry : sentence1.literals.entrySet()) {
				literalSentence1 = entry.getValue();
			}
			for (Map.Entry<String, FolLiteral> entry : sentence2.literals.entrySet()) {
				literalSentence2 = entry.getValue();
			}

			String literal1 = literalSentence1.toString().replace(Constants.NOT, ' ').trim();
			String literal2 = literalSentence2.toString().replace(Constants.NOT, ' ').trim();

			return (literal1.equals(literal2) && literalSentence1.isPositive != literalSentence2.isPositive);
		}
		return false;
	}

	private FolLiteral getLiteral(String literalType) {
		return literals.get(literalType);
	}
	
	@Override
	public String toString() {
		StringBuilder sentenceBuilder = new StringBuilder();
		for(Map.Entry<String, FolLiteral> entry : literals.entrySet()) {
			sentenceBuilder.append(entry.getValue().toString());
			sentenceBuilder.append(Constants.OR);
		}
		return sentenceBuilder.substring(0, sentenceBuilder.length() - 1);
	}

	public static void main(String[] args) {
		FolSentence s1 = new FolSentence("~B[x,Aardvark]");
		//FolSentence s2 = new FolSentence("B[y,Aardvark,t]");
		FolSentence s3 = new FolSentence("B[x,y]|A[b,y]");
		//System.out.println(FolSentence.isContradiction(s1, s2));
		System.out.println(FolSentence.applyResolution(s1, s3, "B"));
	}
}
