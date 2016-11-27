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
		RULE_notSentence = 3, RULE_andOrSentence = 4, RULE_operator = 5, RULE_literal = 6, 
		RULE_listPredicates = 7;
	public static final String[] ruleNames = {
		"sentence", "complexSentence", "implicationSentence", "notSentence", "andOrSentence", 
		"operator", "literal", "listPredicates"
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
		public AndOrSentenceContext andOrSentence() {
			return getRuleContext(AndOrSentenceContext.class,0);
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
			setState(23);
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
				andOrSentence();
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
			setState(25);
			match(OPENING_BRACKET);
			setState(26);
			sentence();
			setState(27);
			match(IMPLIES);
			setState(28);
			sentence();
			setState(29);
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
		public NotSentenceContext notSentence() {
			return getRuleContext(NotSentenceContext.class,0);
		}
		public TerminalNode CLOSING_BRACKET() { return getToken(FolParser.CLOSING_BRACKET, 0); }
		public AndOrSentenceContext andOrSentence() {
			return getRuleContext(AndOrSentenceContext.class,0);
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
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(OPENING_BRACKET);
				setState(32);
				match(NOT);
				setState(33);
				notSentence();
				setState(34);
				match(CLOSING_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(OPENING_BRACKET);
				setState(37);
				match(NOT);
				setState(38);
				andOrSentence();
				setState(39);
				match(CLOSING_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				match(OPENING_BRACKET);
				setState(42);
				match(NOT);
				setState(43);
				literal();
				setState(44);
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

	public static class AndOrSentenceContext extends ParserRuleContext {
		public TerminalNode OPENING_BRACKET() { return getToken(FolParser.OPENING_BRACKET, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode CLOSING_BRACKET() { return getToken(FolParser.CLOSING_BRACKET, 0); }
		public List<AndOrSentenceContext> andOrSentence() {
			return getRuleContexts(AndOrSentenceContext.class);
		}
		public AndOrSentenceContext andOrSentence(int i) {
			return getRuleContext(AndOrSentenceContext.class,i);
		}
		public AndOrSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andOrSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).enterAndOrSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).exitAndOrSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FolVisitor ) return ((FolVisitor<? extends T>)visitor).visitAndOrSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndOrSentenceContext andOrSentence() throws RecognitionException {
		AndOrSentenceContext _localctx = new AndOrSentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_andOrSentence);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(OPENING_BRACKET);
				setState(49);
				literal();
				setState(50);
				operator();
				setState(51);
				literal();
				setState(52);
				match(CLOSING_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(OPENING_BRACKET);
				setState(55);
				andOrSentence();
				setState(56);
				operator();
				setState(57);
				andOrSentence();
				setState(58);
				match(CLOSING_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				match(OPENING_BRACKET);
				setState(61);
				andOrSentence();
				setState(62);
				operator();
				setState(63);
				literal();
				setState(64);
				match(CLOSING_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(OPENING_BRACKET);
				setState(67);
				literal();
				setState(68);
				operator();
				setState(69);
				andOrSentence();
				setState(70);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(FolParser.AND, 0); }
		public TerminalNode OR() { return getToken(FolParser.OR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FolListener ) ((FolListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FolVisitor ) return ((FolVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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
			setState(87);
			switch (_input.LA(1)) {
			case CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(CONSTANT);
				setState(77);
				match(OPENING_BRACKET);
				setState(78);
				listPredicates();
				setState(79);
				match(CLOSING_BRACKET);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(NOT);
				setState(82);
				match(CONSTANT);
				setState(83);
				match(OPENING_BRACKET);
				setState(84);
				listPredicates();
				setState(85);
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
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(VARIABLE);
				setState(90);
				match(COMMA);
				setState(91);
				listPredicates();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(VARIABLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(CONSTANT);
				setState(94);
				match(COMMA);
				setState(95);
				listPredicates();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\ff\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\5\2\25\n\2"+
		"\3\3\3\3\3\3\5\3\32\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6K\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bZ\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\td\n\t\3\t\2\2\n\2\4\6\b\n\f"+
		"\16\20\2\3\3\2\7\bi\2\24\3\2\2\2\4\31\3\2\2\2\6\33\3\2\2\2\b\60\3\2\2"+
		"\2\nJ\3\2\2\2\fL\3\2\2\2\16Y\3\2\2\2\20c\3\2\2\2\22\25\5\4\3\2\23\25\5"+
		"\16\b\2\24\22\3\2\2\2\24\23\3\2\2\2\25\3\3\2\2\2\26\32\5\6\4\2\27\32\5"+
		"\b\5\2\30\32\5\n\6\2\31\26\3\2\2\2\31\27\3\2\2\2\31\30\3\2\2\2\32\5\3"+
		"\2\2\2\33\34\7\5\2\2\34\35\5\2\2\2\35\36\7\13\2\2\36\37\5\2\2\2\37 \7"+
		"\6\2\2 \7\3\2\2\2!\"\7\5\2\2\"#\7\t\2\2#$\5\b\5\2$%\7\6\2\2%\61\3\2\2"+
		"\2&\'\7\5\2\2\'(\7\t\2\2()\5\n\6\2)*\7\6\2\2*\61\3\2\2\2+,\7\5\2\2,-\7"+
		"\t\2\2-.\5\16\b\2./\7\6\2\2/\61\3\2\2\2\60!\3\2\2\2\60&\3\2\2\2\60+\3"+
		"\2\2\2\61\t\3\2\2\2\62\63\7\5\2\2\63\64\5\16\b\2\64\65\5\f\7\2\65\66\5"+
		"\16\b\2\66\67\7\6\2\2\67K\3\2\2\289\7\5\2\29:\5\n\6\2:;\5\f\7\2;<\5\n"+
		"\6\2<=\7\6\2\2=K\3\2\2\2>?\7\5\2\2?@\5\n\6\2@A\5\f\7\2AB\5\16\b\2BC\7"+
		"\6\2\2CK\3\2\2\2DE\7\5\2\2EF\5\16\b\2FG\5\f\7\2GH\5\n\6\2HI\7\6\2\2IK"+
		"\3\2\2\2J\62\3\2\2\2J8\3\2\2\2J>\3\2\2\2JD\3\2\2\2K\13\3\2\2\2LM\t\2\2"+
		"\2M\r\3\2\2\2NO\7\f\2\2OP\7\5\2\2PQ\5\20\t\2QR\7\6\2\2RZ\3\2\2\2ST\7\t"+
		"\2\2TU\7\f\2\2UV\7\5\2\2VW\5\20\t\2WX\7\6\2\2XZ\3\2\2\2YN\3\2\2\2YS\3"+
		"\2\2\2Z\17\3\2\2\2[\\\7\3\2\2\\]\7\n\2\2]d\5\20\t\2^d\7\3\2\2_`\7\f\2"+
		"\2`a\7\n\2\2ad\5\20\t\2bd\7\f\2\2c[\3\2\2\2c^\3\2\2\2c_\3\2\2\2cb\3\2"+
		"\2\2d\21\3\2\2\2\b\24\31\60JYc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}