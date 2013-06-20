package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class imp_section_1_0 extends Strategy 
{ 
  public static imp_section_1_0 instance = new imp_section_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("imp_section_1_0");
    Fail265:
    { 
      IStrategoTerm t_147 = null;
      IStrategoTerm o_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consimp_section_1 != ((IStrategoAppl)term).getConstructor())
        break Fail265;
      o_147 = term.getSubterm(0);
      IStrategoList annos217 = term.getAnnotations();
      t_147 = annos217;
      term = f_29.invoke(context, o_147);
      if(term == null)
        break Fail265;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consimp_section_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}