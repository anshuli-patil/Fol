// Generated from Fol.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARIABLE=1, WHITESPACE=2, OPENING_BRACKET=3, CLOSING_BRACKET=4, AND=5, 
		OR=6, NOT=7, COMMA=8, IMPLIES=9, CONSTANT=10;
	public static final int
		RULE_sentence = 0, RULE_complex_sentence = 1, RULE_implication_sentence = 2, 
		RULE_not_sentence = 3, RULE_and_sentence = 4, RULE_or_sentence = 5, RULE_literal = 6, 
		RULE_list_predicates = 7;
	public static final String[] ruleNames = {
		"sentence", "complex_sentence", "implication_sentence", "not_sentence", 
		"and_sentence", "or_sentence", "literal", "list_predicates"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "'&'", "'|'", "'~'", "','", "'=>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VARIABLE", "WHITESPACE", "OPENING_BRACKET", "CLOSING_BRACKET", 
		"AND", "OR", "NOT", "COMMA", "IMPLIES", "CONSTANT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Fol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SentenceContext extends ParserRuleContext {
		public Complex_sentenceContext complex_sentence() {
			return getRuleContext(Complex_sentenceContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FolVisitor ) return ((FolVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentence);
		try {
			setState(18);
			switch (_input.LA(1)) {
			case OPENING_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				complex_sentence();
				}
				break;
			case NOT:
			case CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Complex_sentenceContext extends ParserRuleContext {
		public Implication_sentenceContext implication_sentence() {
			return getRuleContext(Implication_sentenceContext.class,0);
		}
		public Not_sentenceContext not_sentence() {
			return getRuleContext(Not_sentenceContext.class,0);
		}
		public And_sentenceContext and_sentence() {
			return getRuleContext(And_sentenceContext.class,0);
		}
		public Or_sentenceContext or_sentence() {
			return getRuleContext(Or_sentenceContext.class,0);
		}
		public Complex_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_sentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FolVisitor ) return ((FolVisitor<? extends T>)visitor).visitComplex_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_sentenceContext complex_sentence() throws RecognitionException {
		Complex_sentenceContext _localctx = new Complex_sentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_complex_sentence);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				implication_sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				not_sentence();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				and_sentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				or_sentence();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implication_sentenceContext extends ParserRuleContext {
		public TerminalNode OPENING_BRACKET() { return getToken(FolParser.OPENING_BRACKET, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode IMPLIES() { return getToken(FolParser.IMPLIES, 0); }
		public TerminalNode CLOSING_BRACKET() { return getToken(FolParser.CLOSING_BRACKET, 0); }
		public Implication_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implication_sentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FolVisitor ) return ((FolVisitor<? extends T>)visitor).visitImplication_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implication_sentenceContext implication_sentence() throws RecognitionException {
		Implication_sentenceContext _localctx = new Implication_sentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_implication_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(OPENING_BRACKET);
			setState(27);
			sentence();
			setState(28);
			match(IMPLIES);
			setState(29);
			sentence();
			setState(30);
			match(CLOSING_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_sentenceContext extends ParserRuleContext {
		public TerminalNode OPENING_BRACKET() { return getToken(FolParser.OPENING_BRACKET, 0); }
		public TerminalNode NOT() { return getToken(FolParser.NOT, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode CLOSING_BRACKET() { return getToken(FolParser.CLOSING_BRACKET, 0); }
		public Not_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_sentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FolVisitor ) return ((FolVisitor<? extends T>)visitor).visitNot_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_sentenceContext not_sentence() throws RecognitionException {
		Not_sentenceContext _localctx = new Not_sentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_not_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(OPENING_BRACKET);
			setState(33);
			match(NOT);
			setState(34);
			sentence();
			setState(35);
			match(CLOSING_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_sentenceContext extends ParserRuleContext {
		public TerminalNode OPENING_BRACKET() { return getToken(FolParser.OPENING_BRACKET, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode AND() { return getToken(FolParser.AND, 0); }
		public TerminalNode CLOSING_BRACKET() { return getToken(FolParser.CLOSING_BRACKET, 0); }
		public And_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_sentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FolVisitor ) return ((FolVisitor<? extends T>)visitor).visitAnd_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_sentenceContext and_sentence() throws RecognitionException {
		And_sentenceContext _localctx = new And_sentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_and_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(OPENING_BRACKET);
			setState(38);
			sentence();
			setState(39);
			match(AND);
			setState(40);
			sentence();
			setState(41);
			match(CLOSING_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_sentenceContext extends ParserRuleContext {
		public TerminalNode OPENING_BRACKET() { return getToken(FolParser.OPENING_BRACKET, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode OR() { return getToken(FolParser.OR, 0); }
		public TerminalNode CLOSING_BRACKET() { return getToken(FolParser.CLOSING_BRACKET, 0); }
		public Or_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_sentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FolVisitor ) return ((FolVisitor<? extends T>)visitor).visitOr_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_sentenceContext or_sentence() throws RecognitionException {
		Or_sentenceContext _localctx = new Or_sentenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_or_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(OPENING_BRACKET);
			setState(44);
			sentence();
			setState(45);
			match(OR);
			setState(46);
			sentence();
			setState(47);
			match(CLOSING_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(FolParser.CONSTANT, 0); }
		public TerminalNode OPENING_BRACKET() { return getToken(FolParser.OPENING_BRACKET, 0); }
		public List_predicatesContext list_predicates() {
			return getRuleContext(List_predicatesContext.class,0);
		}
		public TerminalNode CLOSING_BRACKET() { return getToken(FolParser.CLOSING_BRACKET, 0); }
		public TerminalNode NOT() { return getToken(FolParser.NOT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FolVisitor ) return ((FolVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_literal);
		try {
			setState(60);
			switch (_input.LA(1)) {
			case CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(CONSTANT);
				setState(50);
				match(OPENING_BRACKET);
				setState(51);
				list_predicates();
				setState(52);
				match(CLOSING_BRACKET);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(NOT);
				setState(55);
				match(CONSTANT);
				setState(56);
				match(OPENING_BRACKET);
				setState(57);
				list_predicates();
				setState(58);
				match(CLOSING_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_predicatesContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(FolParser.VARIABLE, 0); }
		public TerminalNode COMMA() { return getToken(FolParser.COMMA, 0); }
		public List_predicatesContext list_predicates() {
			return getRuleContext(List_predicatesContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(FolParser.CONSTANT, 0); }
		public List_predicatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_predicates; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FolVisitor ) return ((FolVisitor<? extends T>)visitor).visitList_predicates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_predicatesContext list_predicates() throws RecognitionException {
		List_predicatesContext _localctx = new List_predicatesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list_predicates);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(VARIABLE);
				setState(63);
				match(COMMA);
				setState(64);
				list_predicates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(VARIABLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(CONSTANT);
				setState(67);
				match(COMMA);
				setState(68);
				list_predicates();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				match(CONSTANT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\fK\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\5\2\25\n\2"+
		"\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b?\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"I\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2J\2\24\3\2\2\2\4\32\3\2\2\2\6\34"+
		"\3\2\2\2\b\"\3\2\2\2\n\'\3\2\2\2\f-\3\2\2\2\16>\3\2\2\2\20H\3\2\2\2\22"+
		"\25\5\4\3\2\23\25\5\16\b\2\24\22\3\2\2\2\24\23\3\2\2\2\25\3\3\2\2\2\26"+
		"\33\5\6\4\2\27\33\5\b\5\2\30\33\5\n\6\2\31\33\5\f\7\2\32\26\3\2\2\2\32"+
		"\27\3\2\2\2\32\30\3\2\2\2\32\31\3\2\2\2\33\5\3\2\2\2\34\35\7\5\2\2\35"+
		"\36\5\2\2\2\36\37\7\13\2\2\37 \5\2\2\2 !\7\6\2\2!\7\3\2\2\2\"#\7\5\2\2"+
		"#$\7\t\2\2$%\5\2\2\2%&\7\6\2\2&\t\3\2\2\2\'(\7\5\2\2()\5\2\2\2)*\7\7\2"+
		"\2*+\5\2\2\2+,\7\6\2\2,\13\3\2\2\2-.\7\5\2\2./\5\2\2\2/\60\7\b\2\2\60"+
		"\61\5\2\2\2\61\62\7\6\2\2\62\r\3\2\2\2\63\64\7\f\2\2\64\65\7\5\2\2\65"+
		"\66\5\20\t\2\66\67\7\6\2\2\67?\3\2\2\289\7\t\2\29:\7\f\2\2:;\7\5\2\2;"+
		"<\5\20\t\2<=\7\6\2\2=?\3\2\2\2>\63\3\2\2\2>8\3\2\2\2?\17\3\2\2\2@A\7\3"+
		"\2\2AB\7\n\2\2BI\5\20\t\2CI\7\3\2\2DE\7\f\2\2EF\7\n\2\2FI\5\20\t\2GI\7"+
		"\f\2\2H@\3\2\2\2HC\3\2\2\2HD\3\2\2\2HG\3\2\2\2I\21\3\2\2\2\6\24\32>H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}