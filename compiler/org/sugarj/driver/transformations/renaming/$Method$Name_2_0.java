package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Method$Name_2_0 extends Strategy 
{ 
  public static $Method$Name_2_0 instance = new $Method$Name_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_39, Strategy p_39)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodName_2_0");
    Fail205:
    { 
      IStrategoTerm a_171 = null;
      IStrategoTerm y_170 = null;
      IStrategoTerm z_170 = null;
      IStrategoTerm h_171 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consMethodName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail205;
      y_170 = term.getSubterm(0);
      z_170 = term.getSubterm(1);
      IStrategoList annos174 = term.getAnnotations();
      a_171 = annos174;
      term = o_39.invoke(context, y_170);
      if(term == null)
        break Fail205;
      h_171 = term;
      term = p_39.invoke(context, z_170);
      if(term == null)
        break Fail205;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consMethodName_2, new IStrategoTerm[]{h_171, term}), checkListAnnos(termFactory, a_171));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}