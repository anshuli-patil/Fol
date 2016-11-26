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
		RULE_sentence = 0, RULE_complexSentence = 1, RULE_implicationSentence = 2, 
		RULE_notSentence = 3, RULE_andSentence = 4, RULE_orSentence = 5, RULE_literal = 6, 
		RULE_listPredicates = 7;
	public static final String[] ruleNames = {
		"sentence", "complexSentence", "implicationSentence", "notSentence", "andSentence", 
		"orSentence", "literal", "listPredicates"
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
		public ComplexSentenceContext complexSentence() {
			return getRuleContext(ComplexSentenceContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).exitSentence(this);
		}
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
				complexSentence();
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

	public static class ComplexSentenceContext extends ParserRuleContext {
		public ImplicationSentenceContext implicationSentence() {
			return getRuleContext(ImplicationSentenceContext.class,0);
		}
		public NotSentenceContext notSentence() {
			return getRuleContext(NotSentenceContext.class,0);
		}
		public AndSentenceContext andSentence() {
			return getRuleContext(AndSentenceContext.class,0);
		}
		public OrSentenceContext orSentence() {
			return getRuleContext(OrSentenceContext.class,0);
		}
		public ComplexSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).enterComplexSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).exitComplexSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FolVisitor ) return ((FolVisitor<? extends T>)visitor).visitComplexSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexSentenceContext complexSentence() throws RecognitionException {
		ComplexSentenceContext _localctx = new ComplexSentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_complexSentence);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				implicationSentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				notSentence();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				andSentence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				orSentence();
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

	public static class ImplicationSentenceContext extends ParserRuleContext {
		public TerminalNode OPENING_BRACKET() { return getToken(FolParser.OPENING_BRACKET, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode IMPLIES() { return getToken(FolParser.IMPLIES, 0); }
		public TerminalNode CLOSING_BRACKET() { return getToken(FolParser.CLOSING_BRACKET, 0); }
		public ImplicationSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicationSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).enterImplicationSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).exitImplicationSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FolVisitor ) return ((FolVisitor<? extends T>)visitor).visitImplicationSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplicationSentenceContext implicationSentence() throws RecognitionException {
		ImplicationSentenceContext _localctx = new ImplicationSentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_implicationSentence);
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

	public static class NotSentenceContext extends ParserRuleContext {
		public TerminalNode OPENING_BRACKET() { return getToken(FolParser.OPENING_BRACKET, 0); }
		public TerminalNode NOT() { return getToken(FolParser.NOT, 0); }
		public ImplicationSentenceContext implicationSentence() {
			return getRuleContext(ImplicationSentenceContext.class,0);
		}
		public TerminalNode CLOSING_BRACKET() { return getToken(FolParser.CLOSING_BRACKET, 0); }
		public NotSentenceContext notSentence() {
			return getRuleContext(NotSentenceContext.class,0);
		}
		public AndSentenceContext andSentence() {
			return getRuleContext(AndSentenceContext.class,0);
		}
		public OrSentenceContext orSentence() {
			return getRuleContext(OrSentenceContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public NotSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).enterNotSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).exitNotSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FolVisitor ) return ((FolVisitor<? extends T>)visitor).visitNotSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotSentenceContext notSentence() throws RecognitionException {
		NotSentenceContext _localctx = new NotSentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_notSentence);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(OPENING_BRACKET);
				setState(33);
				match(NOT);
				setState(34);
				implicationSentence();
				setState(35);
				match(CLOSING_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(OPENING_BRACKET);
				setState(38);
				match(NOT);
				setState(39);
				notSentence();
				setState(40);
				match(CLOSING_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(OPENING_BRACKET);
				setState(43);
				match(NOT);
				setState(44);
				andSentence();
				setState(45);
				match(CLOSING_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(OPENING_BRACKET);
				setState(48);
				match(NOT);
				setState(49);
				orSentence();
				setState(50);
				match(CLOSING_BRACKET);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				match(OPENING_BRACKET);
				setState(53);
				match(NOT);
				setState(54);
				literal();
				setState(55);
				match(CLOSING_BRACKET);
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

	public static class AndSentenceContext extends ParserRuleContext {
		public TerminalNode OPENING_BRACKET() { return getToken(FolParser.OPENING_BRACKET, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode AND() { return getToken(FolParser.AND, 0); }
		public TerminalNode CLOSING_BRACKET() { return getToken(FolParser.CLOSING_BRACKET, 0); }
		public AndSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).enterAndSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).exitAndSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FolVisitor ) return ((FolVisitor<? extends T>)visitor).visitAndSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndSentenceContext andSentence() throws RecognitionException {
		AndSentenceContext _localctx = new AndSentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_andSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(OPENING_BRACKET);
			setState(60);
			sentence();
			setState(61);
			match(AND);
			setState(62);
			sentence();
			setState(63);
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

	public static class OrSentenceContext extends ParserRuleContext {
		public TerminalNode OPENING_BRACKET() { return getToken(FolParser.OPENING_BRACKET, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode OR() { return getToken(FolParser.OR, 0); }
		public TerminalNode CLOSING_BRACKET() { return getToken(FolParser.CLOSING_BRACKET, 0); }
		public OrSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).enterOrSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).exitOrSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FolVisitor ) return ((FolVisitor<? extends T>)visitor).visitOrSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrSentenceContext orSentence() throws RecognitionException {
		OrSentenceContext _localctx = new OrSentenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_orSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(OPENING_BRACKET);
			setState(66);
			sentence();
			setState(67);
			match(OR);
			setState(68);
			sentence();
			setState(69);
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
		public ListPredicatesContext listPredicates() {
			return getRuleContext(ListPredicatesContext.class,0);
		}
		public TerminalNode CLOSING_BRACKET() { return getToken(FolParser.CLOSING_BRACKET, 0); }
		public TerminalNode NOT() { return getToken(FolParser.NOT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).exitLiteral(this);
		}
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
			setState(82);
			switch (_input.LA(1)) {
			case CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(CONSTANT);
				setState(72);
				match(OPENING_BRACKET);
				setState(73);
				listPredicates();
				setState(74);
				match(CLOSING_BRACKET);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(NOT);
				setState(77);
				match(CONSTANT);
				setState(78);
				match(OPENING_BRACKET);
				setState(79);
				listPredicates();
				setState(80);
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

	public static class ListPredicatesContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(FolParser.VARIABLE, 0); }
		public TerminalNode COMMA() { return getToken(FolParser.COMMA, 0); }
		public ListPredicatesContext listPredicates() {
			return getRuleContext(ListPredicatesContext.class,0);
		}
		public TerminalNode CONSTANT() { return getToken(FolParser.CONSTANT, 0); }
		public ListPredicatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listPredicates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).enterListPredicates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).exitListPredicates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FolVisitor ) return ((FolVisitor<? extends T>)visitor).visitListPredicates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListPredicatesContext listPredicates() throws RecognitionException {
		ListPredicatesContext _localctx = new ListPredicatesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listPredicates);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(VARIABLE);
				setState(85);
				match(COMMA);
				setState(86);
				listPredicates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(VARIABLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(CONSTANT);
				setState(89);
				match(COMMA);
				setState(90);
				listPredicates();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\fa\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\5\2\25\n\2"+
		"\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bU\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t_\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2d\2\24\3\2\2"+
		"\2\4\32\3\2\2\2\6\34\3\2\2\2\b;\3\2\2\2\n=\3\2\2\2\fC\3\2\2\2\16T\3\2"+
		"\2\2\20^\3\2\2\2\22\25\5\4\3\2\23\25\5\16\b\2\24\22\3\2\2\2\24\23\3\2"+
		"\2\2\25\3\3\2\2\2\26\33\5\6\4\2\27\33\5\b\5\2\30\33\5\n\6\2\31\33\5\f"+
		"\7\2\32\26\3\2\2\2\32\27\3\2\2\2\32\30\3\2\2\2\32\31\3\2\2\2\33\5\3\2"+
		"\2\2\34\35\7\5\2\2\35\36\5\2\2\2\36\37\7\13\2\2\37 \5\2\2\2 !\7\6\2\2"+
		"!\7\3\2\2\2\"#\7\5\2\2#$\7\t\2\2$%\5\6\4\2%&\7\6\2\2&<\3\2\2\2\'(\7\5"+
		"\2\2()\7\t\2\2)*\5\b\5\2*+\7\6\2\2+<\3\2\2\2,-\7\5\2\2-.\7\t\2\2./\5\n"+
		"\6\2/\60\7\6\2\2\60<\3\2\2\2\61\62\7\5\2\2\62\63\7\t\2\2\63\64\5\f\7\2"+
		"\64\65\7\6\2\2\65<\3\2\2\2\66\67\7\5\2\2\678\7\t\2\289\5\16\b\29:\7\6"+
		"\2\2:<\3\2\2\2;\"\3\2\2\2;\'\3\2\2\2;,\3\2\2\2;\61\3\2\2\2;\66\3\2\2\2"+
		"<\t\3\2\2\2=>\7\5\2\2>?\5\2\2\2?@\7\7\2\2@A\5\2\2\2AB\7\6\2\2B\13\3\2"+
		"\2\2CD\7\5\2\2DE\5\2\2\2EF\7\b\2\2FG\5\2\2\2GH\7\6\2\2H\r\3\2\2\2IJ\7"+
		"\f\2\2JK\7\5\2\2KL\5\20\t\2LM\7\6\2\2MU\3\2\2\2NO\7\t\2\2OP\7\f\2\2PQ"+
		"\7\5\2\2QR\5\20\t\2RS\7\6\2\2SU\3\2\2\2TI\3\2\2\2TN\3\2\2\2U\17\3\2\2"+
		"\2VW\7\3\2\2WX\7\n\2\2X_\5\20\t\2Y_\7\3\2\2Z[\7\f\2\2[\\\7\n\2\2\\_\5"+
		"\20\t\2]_\7\f\2\2^V\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^]\3\2\2\2_\21\3\2\2\2"+
		"\7\24\32;T^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}