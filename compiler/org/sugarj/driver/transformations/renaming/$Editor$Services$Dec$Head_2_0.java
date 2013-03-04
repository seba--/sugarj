package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Editor$Services$Dec$Head_2_0 extends Strategy 
{ 
  public static $Editor$Services$Dec$Head_2_0 instance = new $Editor$Services$Dec$Head_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_27, Strategy h_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EditorServicesDecHead_2_0");
    Fail36:
    { 
      IStrategoTerm f_126 = null;
      IStrategoTerm d_126 = null;
      IStrategoTerm e_126 = null;
      IStrategoTerm g_126 = null;
      if(term.getTermType() != IStrategoTerm.APPL || out._consEditorServicesDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail36;
      d_126 = term.getSubterm(0);
      e_126 = term.getSubterm(1);
      IStrategoList annos13 = term.getAnnotations();
      f_126 = annos13;
      term = g_27.invoke(context, d_126);
      if(term == null)
        break Fail36;
      g_126 = term;
      term = h_27.invoke(context, e_126);
      if(term == null)
        break Fail36;
      term = termFactory.annotateTerm(termFactory.makeAppl(out._consEditorServicesDecHead_2, new IStrategoTerm[]{g_126, term}), checkListAnnos(termFactory, f_126));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}