package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class$Or$Interface$Type_2_0 extends Strategy 
{ 
  public static $Class$Or$Interface$Type_2_0 instance = new $Class$Or$Interface$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_39, Strategy c_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ClassOrInterfaceType_2_0");
    Fail195:
    { 
      IStrategoTerm n_169 = null;
      IStrategoTerm l_169 = null;
      IStrategoTerm m_169 = null;
      IStrategoTerm o_169 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consClassOrInterfaceType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail195;
      l_169 = term.getSubterm(0);
      m_169 = term.getSubterm(1);
      IStrategoList annos164 = term.getAnnotations();
      n_169 = annos164;
      term = b_39.invoke(context, l_169);
      if(term == null)
        break Fail195;
      o_169 = term;
      term = c_39.invoke(context, m_169);
      if(term == null)
        break Fail195;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consClassOrInterfaceType_2, new IStrategoTerm[]{o_169, term}), checkListAnnos(termFactory, n_169));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}