package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Enum$Body$Decs_1_0 extends Strategy 
{ 
  public static $Enum$Body$Decs_1_0 instance = new $Enum$Body$Decs_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnumBodyDecs_1_0");
    Fail86:
    { 
      IStrategoTerm d_141 = null;
      IStrategoTerm z_140 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consEnumBodyDecs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail86;
      z_140 = term.getSubterm(0);
      IStrategoList annos62 = term.getAnnotations();
      d_141 = annos62;
      term = d_31.invoke(context, z_140);
      if(term == null)
        break Fail86;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consEnumBodyDecs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_141));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}