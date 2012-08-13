package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Compile$Error_2_0 extends Strategy 
{ 
  public static $Compile$Error_2_0 instance = new $Compile$Error_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_19, Strategy b_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompileError_2_0");
    Fail48:
    { 
      IStrategoTerm d_109 = null;
      IStrategoTerm b_109 = null;
      IStrategoTerm c_109 = null;
      IStrategoTerm e_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consCompileError_2 != ((IStrategoAppl)term).getConstructor())
        break Fail48;
      b_109 = term.getSubterm(0);
      c_109 = term.getSubterm(1);
      IStrategoList annos30 = term.getAnnotations();
      d_109 = annos30;
      term = a_19.invoke(context, b_109);
      if(term == null)
        break Fail48;
      e_109 = term;
      term = b_19.invoke(context, c_109);
      if(term == null)
        break Fail48;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consCompileError_2, new IStrategoTerm[]{e_109, term}), checkListAnnos(termFactory, d_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}