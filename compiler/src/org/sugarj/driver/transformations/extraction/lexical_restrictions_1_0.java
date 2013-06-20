package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class lexical_restrictions_1_0 extends Strategy 
{ 
  public static lexical_restrictions_1_0 instance = new lexical_restrictions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_28)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_restrictions_1_0");
    Fail255:
    { 
      IStrategoTerm a_146 = null;
      IStrategoTerm z_145 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._conslexical_restrictions_1 != ((IStrategoAppl)term).getConstructor())
        break Fail255;
      z_145 = term.getSubterm(0);
      IStrategoList annos207 = term.getAnnotations();
      a_146 = annos207;
      term = v_28.invoke(context, z_145);
      if(term == null)
        break Fail255;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._conslexical_restrictions_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, a_146));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}