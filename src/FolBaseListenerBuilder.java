import org.antlr.v4.runtime.CommonTokenStream;

public class FolBaseListenerBuilder {

	/**
	 * Builder returns object of required type
	 * 
	 * @param tokens
	 * @param baseListenerType
	 */
	public FolBaseListenerImpl getListener(CommonTokenStream tokens, int baseListenerType) {

		FolBaseListenerImpl folModifier = null;

		if (baseListenerType == FolLexer.IMPLIES) {
			folModifier = new FolBaseListenerImplicationElimination(tokens);
		} else if (baseListenerType == FolLexer.NOT) {
			folModifier = new FolBaseListenerNotScope(tokens);
		} else {
			folModifier = new FolBaseListenerDistributivity(tokens);
		}
		return folModifier;
	}
}
