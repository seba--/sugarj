package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Op$Decl$Q_2_0 extends Strategy 
{ 
  public static $Op$Decl$Q_2_0 instance = new $Op$Decl$Q_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_345, Strategy z_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OpDeclQ_2_0");
    Fail951:
    { 
      IStrategoTerm o_455 = null;
      IStrategoTerm m_455 = null;
      IStrategoTerm n_455 = null;
      IStrategoTerm p_455 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consOpDeclQ_2 != ((IStrategoAppl)term).getConstructor())
        break Fail951;
      m_455 = term.getSubterm(0);
      n_455 = term.getSubterm(1);
      IStrategoList annos194 = term.getAnnotations();
      o_455 = annos194;
      term = y_345.invoke(context, m_455);
      if(term == null)
        break Fail951;
      p_455 = term;
      term = z_345.invoke(context, n_455);
      if(term == null)
        break Fail951;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consOpDeclQ_2, new IStrategoTerm[]{p_455, term}), checkListAnnos(termFactory, o_455));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}