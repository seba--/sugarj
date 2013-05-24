package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Import$Renamed_2_0 extends Strategy 
{ 
  public static $Import$Renamed_2_0 instance = new $Import$Renamed_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_339, Strategy l_339)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImportRenamed_2_0");
    Fail851:
    { 
      IStrategoTerm t_438 = null;
      IStrategoTerm r_438 = null;
      IStrategoTerm s_438 = null;
      IStrategoTerm u_438 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consImportRenamed_2 != ((IStrategoAppl)term).getConstructor())
        break Fail851;
      r_438 = term.getSubterm(0);
      s_438 = term.getSubterm(1);
      IStrategoList annos97 = term.getAnnotations();
      t_438 = annos97;
      term = k_339.invoke(context, r_438);
      if(term == null)
        break Fail851;
      u_438 = term;
      term = l_339.invoke(context, s_438);
      if(term == null)
        break Fail851;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consImportRenamed_2, new IStrategoTerm[]{u_438, term}), checkListAnnos(termFactory, t_438));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}