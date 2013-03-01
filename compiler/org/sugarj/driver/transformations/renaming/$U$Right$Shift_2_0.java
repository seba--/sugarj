package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $U$Right$Shift_2_0 extends Strategy 
{ 
  public static $U$Right$Shift_2_0 instance = new $U$Right$Shift_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_37, Strategy b_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("URightShift_2_0");
    Fail165:
    { 
      IStrategoTerm h_162 = null;
      IStrategoTerm z_161 = null;
      IStrategoTerm c_162 = null;
      IStrategoTerm i_162 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consURightShift_2 != ((IStrategoAppl)term).getConstructor())
        break Fail165;
      z_161 = term.getSubterm(0);
      c_162 = term.getSubterm(1);
      IStrategoList annos135 = term.getAnnotations();
      h_162 = annos135;
      term = a_37.invoke(context, z_161);
      if(term == null)
        break Fail165;
      i_162 = term;
      term = b_37.invoke(context, c_162);
      if(term == null)
        break Fail165;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consURightShift_2, new IStrategoTerm[]{i_162, term}), checkListAnnos(termFactory, h_162));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}