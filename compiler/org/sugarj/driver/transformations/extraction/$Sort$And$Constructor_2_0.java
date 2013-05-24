package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Sort$And$Constructor_2_0 extends Strategy 
{ 
  public static $Sort$And$Constructor_2_0 instance = new $Sort$And$Constructor_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_339, Strategy e_339)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortAndConstructor_2_0");
    Fail846:
    { 
      IStrategoTerm b_438 = null;
      IStrategoTerm z_437 = null;
      IStrategoTerm a_438 = null;
      IStrategoTerm c_438 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consSortAndConstructor_2 != ((IStrategoAppl)term).getConstructor())
        break Fail846;
      z_437 = term.getSubterm(0);
      a_438 = term.getSubterm(1);
      IStrategoList annos93 = term.getAnnotations();
      b_438 = annos93;
      term = d_339.invoke(context, z_437);
      if(term == null)
        break Fail846;
      c_438 = term;
      term = e_339.invoke(context, a_438);
      if(term == null)
        break Fail846;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consSortAndConstructor_2, new IStrategoTerm[]{c_438, term}), checkListAnnos(termFactory, b_438));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}