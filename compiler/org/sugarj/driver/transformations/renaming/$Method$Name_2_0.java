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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_25, Strategy h_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("MethodName_2_0");
    Fail164:
    { 
      IStrategoTerm c_130 = null;
      IStrategoTerm z_129 = null;
      IStrategoTerm a_130 = null;
      IStrategoTerm d_130 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consMethodName_2 != ((IStrategoAppl)term).getConstructor())
        break Fail164;
      z_129 = term.getSubterm(0);
      a_130 = term.getSubterm(1);
      IStrategoList annos148 = term.getAnnotations();
      c_130 = annos148;
      term = g_25.invoke(context, z_129);
      if(term == null)
        break Fail164;
      d_130 = term;
      term = h_25.invoke(context, a_130);
      if(term == null)
        break Fail164;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consMethodName_2, new IStrategoTerm[]{d_130, term}), checkListAnnos(termFactory, c_130));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}