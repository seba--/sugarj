package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Fun$Type_2_0 extends Strategy 
{ 
  public static $Fun$Type_2_0 instance = new $Fun$Type_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_47, Strategy k_47)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FunType_2_0");
    Fail347:
    { 
      IStrategoTerm b_194 = null;
      IStrategoTerm z_193 = null;
      IStrategoTerm a_194 = null;
      IStrategoTerm c_194 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consFunType_2 != ((IStrategoAppl)term).getConstructor())
        break Fail347;
      z_193 = term.getSubterm(0);
      a_194 = term.getSubterm(1);
      IStrategoList annos291 = term.getAnnotations();
      b_194 = annos291;
      term = j_47.invoke(context, z_193);
      if(term == null)
        break Fail347;
      c_194 = term;
      term = k_47.invoke(context, a_194);
      if(term == null)
        break Fail347;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consFunType_2, new IStrategoTerm[]{c_194, term}), checkListAnnos(termFactory, b_194));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}