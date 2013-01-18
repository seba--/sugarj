package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Constructors_1_0 extends Strategy 
{ 
  public static $Constructors_1_0 instance = new $Constructors_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_48)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Constructors_1_0");
    Fail361:
    { 
      IStrategoTerm g_196 = null;
      IStrategoTerm f_196 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consConstructors_1 != ((IStrategoAppl)term).getConstructor())
        break Fail361;
      f_196 = term.getSubterm(0);
      IStrategoList annos305 = term.getAnnotations();
      g_196 = annos305;
      term = e_48.invoke(context, f_196);
      if(term == null)
        break Fail361;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consConstructors_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_196));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}