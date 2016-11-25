package edu.usc.anshulip.ai.hw3;


import java.util.ArrayList;
import java.util.List;

/**
 * Defines a predicate of a FOL Literal
 * @author anshulip
 *
 */
public class FolPredicate {

	String value;
	boolean isGroundTerm;

	public static List<FolPredicate> getPredicates(List<String> rawPredicateList) {
		List<FolPredicate> predicates = new ArrayList<FolPredicate>();
		for (String rawPredicate : rawPredicateList) {
			predicates.add(new FolPredicate(rawPredicate, isGround(rawPredicate)));
		}

		return predicates;
	}

	private static boolean isGround(String rawPredicate) {
		if (rawPredicate.toLowerCase().equals(rawPredicate)) {
			return false;
		}
		return true;
	}

	FolPredicate(String value, boolean isGroundTerm) {
		this.value = value;
		this.isGroundTerm = isGroundTerm;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
