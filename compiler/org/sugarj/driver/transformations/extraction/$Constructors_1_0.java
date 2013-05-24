package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Constructors_1_0");
    Fail946:
    { 
      IStrategoTerm u_454 = null;
      IStrategoTerm t_454 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext._consConstructors_1 != ((IStrategoAppl)term).getConstructor())
        break Fail946;
      t_454 = term.getSubterm(0);
      IStrategoList annos189 = term.getAnnotations();
      u_454 = annos189;
      term = r_345.invoke(context, t_454);
      if(term == null)
        break Fail946;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext._consConstructors_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_454));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}