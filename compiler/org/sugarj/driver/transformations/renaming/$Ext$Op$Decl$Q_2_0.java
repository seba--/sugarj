package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Ext$Op$Decl$Q_2_0 extends Strategy 
{ 
  public static $Ext$Op$Decl$Q_2_0 instance = new $Ext$Op$Decl$Q_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_47, Strategy o_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDeclQ_2_0");
    Fail350:
    { 
      IStrategoTerm m_194 = null;
      IStrategoTerm k_194 = null;
      IStrategoTerm l_194 = null;
      IStrategoTerm n_194 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consExtOpDeclQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail350;
      k_194 = term.getSubterm(0);
      l_194 = term.getSubterm(1);
      IStrategoList annos294 = term.getAnnotations();
      m_194 = annos294;
      term = n_47.invoke(context, k_194);
      if(term == null)
        break Fail350;
      n_194 = term;
      term = o_47.invoke(context, l_194);
      if(term == null)
        break Fail350;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consExtOpDeclQ_2, new IStrategoTerm[]{n_194, term}), checkListAnnos(termFactory, m_194));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}