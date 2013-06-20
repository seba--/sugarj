package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Signature_1_0 extends Strategy 
{ 
  public static $Signature_1_0 instance = new $Signature_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Signature_1_0");
    Fail70:
    { 
      IStrategoTerm i_110 = null;
      IStrategoTerm h_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consSignature_1 != ((IStrategoAppl)term).getConstructor())
        break Fail70;
      h_110 = term.getSubterm(0);
      IStrategoList annos43 = term.getAnnotations();
      i_110 = annos43;
      term = q_18.invoke(context, h_110);
      if(term == null)
        break Fail70;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consSignature_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}