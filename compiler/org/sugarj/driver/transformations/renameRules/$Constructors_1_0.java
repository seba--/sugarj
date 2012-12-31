package org.sugarj.driver.transformations.renameRules;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Constructors_1_0");
    Fail123:
    { 
      IStrategoTerm a_112 = null;
      IStrategoTerm z_111 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consConstructors_1 != ((IStrategoAppl)term).getConstructor())
        break Fail123;
      z_111 = term.getSubterm(0);
      IStrategoList annos114 = term.getAnnotations();
      a_112 = annos114;
      term = r_17.invoke(context, z_111);
      if(term == null)
        break Fail123;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consConstructors_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_112));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}