package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Class_1_0 extends Strategy 
{ 
  public static $Class_1_0 instance = new $Class_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_35)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Class_1_0");
    Fail141:
    { 
      IStrategoTerm d_156 = null;
      IStrategoTerm c_156 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consClass_1 != ((IStrategoAppl)term).getConstructor())
        break Fail141;
      c_156 = term.getSubterm(0);
      IStrategoList annos111 = term.getAnnotations();
      d_156 = annos111;
      term = f_35.invoke(context, c_156);
      if(term == null)
        break Fail141;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consClass_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_156));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}