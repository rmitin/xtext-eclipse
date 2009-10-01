/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.common.types.xtext.ui;

import org.eclipse.xtext.common.types.Type;
import org.eclipse.xtext.ui.common.editor.contentassist.ICompletionProposalFactory;
import org.eclipse.xtext.ui.core.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.core.editor.contentassist.ICompletionProposalAcceptor;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public abstract class AbstractTypesProposalProvider implements ITypesProposalProvider {

	public void createTypeProposals(ICompletionProposalFactory proposalFactory, ContentAssistContext context, 
			ICompletionProposalAcceptor acceptor) {
		createTypeProposals(proposalFactory, context, TypeMatchFilters.all(), acceptor);
	}
	
	public void createSubTypeProposals(Type superType, ICompletionProposalFactory proposalFactory,
			ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createSubTypeProposals(superType, proposalFactory, context, TypeMatchFilters.all(), acceptor);
	}

}
