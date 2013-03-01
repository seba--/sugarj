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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_26, Strategy y_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompileError_2_0");
    Fail31:
    { 
      IStrategoTerm i_125 = null;
      IStrategoTerm f_125 = null;
      IStrategoTerm h_125 = null;
      IStrategoTerm j_125 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consCompileError_2 != ((IStrategoAppl)term).getConstructor())
        break Fail31;
      f_125 = term.getSubterm(0);
      h_125 = term.getSubterm(1);
      IStrategoList annos8 = term.getAnnotations();
      i_125 = annos8;
      term = x_26.invoke(context, f_125);
      if(term == null)
        break Fail31;
      j_125 = term;
      term = y_26.invoke(context, h_125);
      if(term == null)
        break Fail31;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consCompileError_2, new IStrategoTerm[]{j_125, term}), checkListAnnos(termFactory, i_125));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}