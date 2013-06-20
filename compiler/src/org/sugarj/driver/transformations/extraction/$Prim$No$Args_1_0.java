package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Prim$No$Args_1_0 extends Strategy 
{ 
  public static $Prim$No$Args_1_0 instance = new $Prim$No$Args_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PrimNoArgs_1_0");
    Fail114:
    { 
      IStrategoTerm c_119 = null;
      IStrategoTerm b_119 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consPrimNoArgs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail114;
      b_119 = term.getSubterm(0);
      IStrategoList annos86 = term.getAnnotations();
      c_119 = annos86;
      term = w_21.invoke(context, b_119);
      if(term == null)
        break Fail114;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consPrimNoArgs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_119));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}