/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class BookElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyDsl.Book");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTitleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cSectionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSectionsSectionParserRuleCall_2_0 = (RuleCall)cSectionsAssignment_2.eContents().get(0);
		
		//Book:
		//	'title' name=ID
		//	sections+=Section*;
		@Override public ParserRule getRule() { return rule; }
		
		//'title' name=ID sections+=Section*
		public Group getGroup() { return cGroup; }
		
		//'title'
		public Keyword getTitleKeyword_0() { return cTitleKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//sections+=Section*
		public Assignment getSectionsAssignment_2() { return cSectionsAssignment_2; }
		
		//Section
		public RuleCall getSectionsSectionParserRuleCall_2_0() { return cSectionsSectionParserRuleCall_2_0; }
	}
	public class SectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyDsl.Section");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final RuleCall cSTRINGTerminalRuleCall_2_0 = (RuleCall)cAlternatives_2.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Keyword cRefKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cSectionReferencesAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final CrossReference cSectionReferencesSectionCrossReference_2_1_1_0 = (CrossReference)cSectionReferencesAssignment_2_1_1.eContents().get(0);
		private final RuleCall cSectionReferencesSectionSectionReferenceParserRuleCall_2_1_1_0_1 = (RuleCall)cSectionReferencesSectionCrossReference_2_1_1_0.eContents().get(1);
		
		//Section:
		//	'section' name=ID (STRING | 'ref' sectionReferences+=[Section|SectionReference])*;
		@Override public ParserRule getRule() { return rule; }
		
		//'section' name=ID (STRING | 'ref' sectionReferences+=[Section|SectionReference])*
		public Group getGroup() { return cGroup; }
		
		//'section'
		public Keyword getSectionKeyword_0() { return cSectionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(STRING | 'ref' sectionReferences+=[Section|SectionReference])*
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_2_0() { return cSTRINGTerminalRuleCall_2_0; }
		
		//'ref' sectionReferences+=[Section|SectionReference]
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//'ref'
		public Keyword getRefKeyword_2_1_0() { return cRefKeyword_2_1_0; }
		
		//sectionReferences+=[Section|SectionReference]
		public Assignment getSectionReferencesAssignment_2_1_1() { return cSectionReferencesAssignment_2_1_1; }
		
		//[Section|SectionReference]
		public CrossReference getSectionReferencesSectionCrossReference_2_1_1_0() { return cSectionReferencesSectionCrossReference_2_1_1_0; }
		
		//SectionReference
		public RuleCall getSectionReferencesSectionSectionReferenceParserRuleCall_2_1_1_0_1() { return cSectionReferencesSectionSectionReferenceParserRuleCall_2_1_1_0_1; }
	}
	public class SectionReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.MyDsl.SectionReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//SectionReference:
		//	ID ('.' ID)?;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)?
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private final BookElements pBook;
	private final SectionElements pSection;
	private final SectionReferenceElements pSectionReference;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pBook = new BookElements();
		this.pSection = new SectionElements();
		this.pSectionReference = new SectionReferenceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl1.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Book:
	//	'title' name=ID
	//	sections+=Section*;
	public BookElements getBookAccess() {
		return pBook;
	}
	
	public ParserRule getBookRule() {
		return getBookAccess().getRule();
	}
	
	//Section:
	//	'section' name=ID (STRING | 'ref' sectionReferences+=[Section|SectionReference])*;
	public SectionElements getSectionAccess() {
		return pSection;
	}
	
	public ParserRule getSectionRule() {
		return getSectionAccess().getRule();
	}
	
	//SectionReference:
	//	ID ('.' ID)?;
	public SectionReferenceElements getSectionReferenceAccess() {
		return pSectionReference;
	}
	
	public ParserRule getSectionReferenceRule() {
		return getSectionReferenceAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
