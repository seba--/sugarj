package org.sugarj.driver.transformations.renaming;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Editor$Services$Dec_2_0 extends Strategy 
{ 
  public static $Editor$Services$Dec_2_0 instance = new $Editor$Services$Dec_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_19, Strategy d_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EditorServicesDec_2_0");
    Fail49:
    { 
      IStrategoTerm i_109 = null;
      IStrategoTerm g_109 = null;
      IStrategoTerm h_109 = null;
      IStrategoTerm j_109 = null;
      if(term.getTermType() != IStrategoTerm.APPL || renaming._consEditorServicesDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail49;
      g_109 = term.getSubterm(0);
      h_109 = term.getSubterm(1);
      IStrategoList annos31 = term.getAnnotations();
      i_109 = annos31;
      term = c_19.invoke(context, g_109);
      if(term == null)
        break Fail49;
      j_109 = term;
      term = d_19.invoke(context, h_109);
      if(term == null)
        break Fail49;
      term = termFactory.annotateTerm(termFactory.makeAppl(renaming._consEditorServicesDec_2, new IStrategoTerm[]{j_109, term}), checkListAnnos(termFactory, i_109));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}