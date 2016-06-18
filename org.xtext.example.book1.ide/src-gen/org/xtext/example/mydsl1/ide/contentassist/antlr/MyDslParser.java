/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.xtext.example.mydsl1.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.mydsl1.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSectionAccess().getAlternatives_2(), "rule__Section__Alternatives_2");
					put(grammarAccess.getBookAccess().getGroup(), "rule__Book__Group__0");
					put(grammarAccess.getSectionAccess().getGroup(), "rule__Section__Group__0");
					put(grammarAccess.getSectionAccess().getGroup_2_1(), "rule__Section__Group_2_1__0");
					put(grammarAccess.getSectionReferenceAccess().getGroup(), "rule__SectionReference__Group__0");
					put(grammarAccess.getSectionReferenceAccess().getGroup_1(), "rule__SectionReference__Group_1__0");
					put(grammarAccess.getBookAccess().getNameAssignment_1(), "rule__Book__NameAssignment_1");
					put(grammarAccess.getBookAccess().getSectionsAssignment_2(), "rule__Book__SectionsAssignment_2");
					put(grammarAccess.getSectionAccess().getNameAssignment_1(), "rule__Section__NameAssignment_1");
					put(grammarAccess.getSectionAccess().getSectionReferencesAssignment_2_1_1(), "rule__Section__SectionReferencesAssignment_2_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMyDslParser typedParser = (InternalMyDslParser) parser;
			typedParser.entryRuleBook();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
