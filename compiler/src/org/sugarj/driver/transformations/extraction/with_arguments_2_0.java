package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class with_arguments_2_0 extends Strategy 
{ 
  public static with_arguments_2_0 instance = new with_arguments_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_26, Strategy s_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("with_arguments_2_0");
    Fail206:
    { 
      IStrategoTerm c_137 = null;
      IStrategoTerm a_137 = null;
      IStrategoTerm b_137 = null;
      IStrategoTerm d_137 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conswith_arguments_2 != ((IStrategoAppl)term).getConstructor())
        break Fail206;
      a_137 = term.getSubterm(0);
      b_137 = term.getSubterm(1);
      IStrategoList annos170 = term.getAnnotations();
      c_137 = annos170;
      term = r_26.invoke(context, a_137);
      if(term == null)
        break Fail206;
      d_137 = term;
      term = s_26.invoke(context, b_137);
      if(term == null)
        break Fail206;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conswith_arguments_2, new IStrategoTerm[]{d_137, term}), checkListAnnos(termFactory, c_137));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}