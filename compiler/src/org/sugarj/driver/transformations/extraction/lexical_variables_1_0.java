package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lexical_variables_1_0 extends Strategy 
{ 
  public static lexical_variables_1_0 instance = new lexical_variables_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_variables_1_0");
    Fail266:
    { 
      IStrategoTerm z_147 = null;
      IStrategoTerm y_147 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conslexical_variables_1 != ((IStrategoAppl)term).getConstructor())
        break Fail266;
      y_147 = term.getSubterm(0);
      IStrategoList annos218 = term.getAnnotations();
      z_147 = annos218;
      term = g_29.invoke(context, y_147);
      if(term == null)
        break Fail266;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conslexical_variables_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_147));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}