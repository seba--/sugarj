package org.sugarj.common.typesmart;

import java.util.WeakHashMap;

import org.spoofax.interpreter.terms.ISimpleTerm;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.spoofax.jsglr_layout.client.imploder.ImploderAttachment;
import org.spoofax.terms.TermFactory;
import org.spoofax.terms.attachments.AbstractTermAttachment;
import org.spoofax.terms.attachments.TermAttachmentType;

/**
 * @author Sebastian Erdweg
 */
public class TypesmartSortAttachment extends AbstractTermAttachment {

  private static final long serialVersionUID = -1071986538130031851L;

  public static final TermAttachmentType<TypesmartSortAttachment> TYPE =
      new TermAttachmentType<TypesmartSortAttachment>(TypesmartSortAttachment.class, "TypesmartSortAttachment", 1){

        @Override
        protected TypesmartSortAttachment fromSubterms(IStrategoTerm[] subterms) {
          return TypesmartSortAttachment.create(subterms[0]);
        }

        @Override
        protected IStrategoTerm[] toSubterms(ITermFactory f, TypesmartSortAttachment attach) {
          return new IStrategoTerm[] {attach.getSort()};
        }
  };
  
  @Override
  public TermAttachmentType<?> getAttachmentType() {
    return TYPE;
  }
  
  private static WeakHashMap<String, TypesmartSortAttachment> cache = new WeakHashMap<String, TypesmartSortAttachment>();
  
  private static ITermFactory factory = new TermFactory();

  public static TypesmartSortAttachment create(IStrategoTerm sort) {
    String key = sort.toString();
    TypesmartSortAttachment result = cache.get(key);
    if (result == null) {
      result = new TypesmartSortAttachment(sort);
      cache.put(key, result);
    }
    return result;
  }
  
  private TypesmartSortAttachment(IStrategoTerm sort) {
    this.sort = sort;
  }
  
  IStrategoTerm sort;
  
  public IStrategoTerm getSort() {
    return sort;
  }
  
  public static TypesmartSortAttachment get(ISimpleTerm term) {
    TypesmartSortAttachment attach = term.getAttachment(TYPE);
    if (attach != null)
      return attach;
    
    String sort = ImploderAttachment.getSort(term);
    if (sort != null) {
      IStrategoTerm sortTerm = factory.makeAppl(factory.makeConstructor("SortNoArgs", 1), factory.makeString(sort));
      return create(sortTerm);
    }
    
    return null;
  }

  public static IStrategoTerm getSort(ISimpleTerm term) {
    TypesmartSortAttachment attach = get(term);
    return attach == null ? null : attach.getSort();
  }

  public static void put(ISimpleTerm term, IStrategoTerm sort) {
    term.putAttachment(TypesmartSortAttachment.create(sort));
  }

  public static void put(ISimpleTerm term, TypesmartSortAttachment attach) {
    term.putAttachment(attach);
  }

  @Override
  public String toString() {
    return "(sort=" + sort.toString() + ")";
  }
}
