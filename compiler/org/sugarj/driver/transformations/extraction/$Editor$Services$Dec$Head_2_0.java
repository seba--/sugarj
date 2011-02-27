package org.sugarj.driver.transformations.extraction;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_31, Strategy b_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EditorServicesDecHead_2_0");
    Fail285:
    { 
      IStrategoTerm h_154 = null;
      IStrategoTerm c_154 = null;
      IStrategoTerm d_154 = null;
      IStrategoTerm i_154 = null;
      if(term.getTermType() != IStrategoTerm.APPL || extraction._consEditorServicesDecHead_2 != ((IStrategoAppl)term).getConstructor())
        break Fail285;
      c_154 = term.getSubterm(0);
      d_154 = term.getSubterm(1);
      IStrategoList annos240 = term.getAnnotations();
      h_154 = annos240;
      term = a_31.invoke(context, c_154);
      if(term == null)
        break Fail285;
      i_154 = term;
      term = b_31.invoke(context, d_154);
      if(term == null)
        break Fail285;
      term = termFactory.annotateTerm(termFactory.makeAppl(extraction._consEditorServicesDecHead_2, new IStrategoTerm[]{i_154, term}), checkListAnnos(termFactory, h_154));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}