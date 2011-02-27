package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_23, Strategy m_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ExtOpDeclQ_2_0");
    Fail129:
    { 
      IStrategoTerm t_123 = null;
      IStrategoTerm r_123 = null;
      IStrategoTerm s_123 = null;
      IStrategoTerm u_123 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consExtOpDeclQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail129;
      r_123 = term.getSubterm(0);
      s_123 = term.getSubterm(1);
      IStrategoList annos103 = term.getAnnotations();
      t_123 = annos103;
      term = l_23.invoke(context, r_123);
      if(term == null)
        break Fail129;
      u_123 = term;
      term = m_23.invoke(context, s_123);
      if(term == null)
        break Fail129;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consExtOpDeclQ_2, new IStrategoTerm[]{u_123, term}), checkListAnnos(termFactory, t_123));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}