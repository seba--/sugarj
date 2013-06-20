package org.sugarj.driver.transformations.extraction;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Overlay$No$Args_2_0 extends Strategy 
{ 
  public static $Overlay$No$Args_2_0 instance = new $Overlay$No$Args_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_18, Strategy h_18)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OverlayNoArgs_2_0");
    Fail62:
    { 
      IStrategoTerm e_109 = null;
      IStrategoTerm c_109 = null;
      IStrategoTerm d_109 = null;
      IStrategoTerm f_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || ext_out._consOverlayNoArgs_2 != ((IStrategoAppl)term).getConstructor())
        break Fail62;
      c_109 = term.getSubterm(0);
      d_109 = term.getSubterm(1);
      IStrategoList annos35 = term.getAnnotations();
      e_109 = annos35;
      term = g_18.invoke(context, c_109);
      if(term == null)
        break Fail62;
      f_109 = term;
      term = h_18.invoke(context, d_109);
      if(term == null)
        break Fail62;
      term = termFactory.annotateTerm(termFactory.makeAppl(ext_out._consOverlayNoArgs_2, new IStrategoTerm[]{f_109, term}), checkListAnnos(termFactory, e_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}