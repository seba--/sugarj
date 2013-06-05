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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Signature_1_0");
    Fail69:
    { 
      IStrategoTerm d_110 = null;
      IStrategoTerm c_110 = null;
      if(term.getTermType() != IStrategoTerm.APPL || outt._consSignature_1 != ((IStrategoAppl)term).getConstructor())
        break Fail69;
      c_110 = term.getSubterm(0);
      IStrategoList annos42 = term.getAnnotations();
      d_110 = annos42;
      term = o_18.invoke(context, c_110);
      if(term == null)
        break Fail69;
      term = termFactory.annotateTerm(termFactory.makeAppl(outt._consSignature_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_110));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}