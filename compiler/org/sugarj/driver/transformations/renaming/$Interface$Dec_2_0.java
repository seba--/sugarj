package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Interface$Dec_2_0 extends Strategy 
{ 
  public static $Interface$Dec_2_0 instance = new $Interface$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_30, Strategy d_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("InterfaceDec_2_0");
    Fail78:
    { 
      IStrategoTerm n_137 = null;
      IStrategoTerm l_137 = null;
      IStrategoTerm m_137 = null;
      IStrategoTerm o_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consInterfaceDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail78;
      l_137 = term.getSubterm(0);
      m_137 = term.getSubterm(1);
      IStrategoList annos54 = term.getAnnotations();
      n_137 = annos54;
      term = c_30.invoke(context, l_137);
      if(term == null)
        break Fail78;
      o_137 = term;
      term = d_30.invoke(context, m_137);
      if(term == null)
        break Fail78;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consInterfaceDec_2, new IStrategoTerm[]{o_137, term}), checkListAnnos(termFactory, n_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}