/* 
 * Kadaster - Publiekrechtelijke beperkingen
 *
 * De definitie van de Publiekrechtelijke beperkingen endpoints en components. 
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// PubliekrechtelijkeBeperkingLinks
    /// </summary>
    [DataContract]
    public partial class PubliekrechtelijkeBeperkingLinks :  IEquatable<PubliekrechtelijkeBeperkingLinks>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PubliekrechtelijkeBeperkingLinks" /> class.
        /// </summary>
        /// <param name="bevoegdGezag">bevoegdGezag.</param>
        /// <param name="stukken">stukken.</param>
        /// <param name="isGebaseerdOpStukdeel">isGebaseerdOpStukdeel.</param>
        /// <param name="isVermeldInStukdelen">isVermeldInStukdelen.</param>
        /// <param name="kadastraalOnroerendeZaak">kadastraalOnroerendeZaak.</param>
        public PubliekrechtelijkeBeperkingLinks(HalLink bevoegdGezag = default(HalLink), List<HalLink> stukken = default(List<HalLink>), HalLink isGebaseerdOpStukdeel = default(HalLink), List<HalLink> isVermeldInStukdelen = default(List<HalLink>), List<HalLink> kadastraalOnroerendeZaak = default(List<HalLink>))
        {
            this.BevoegdGezag = bevoegdGezag;
            this.Stukken = stukken;
            this.IsGebaseerdOpStukdeel = isGebaseerdOpStukdeel;
            this.IsVermeldInStukdelen = isVermeldInStukdelen;
            this.KadastraalOnroerendeZaak = kadastraalOnroerendeZaak;
        }
        
        /// <summary>
        /// Gets or Sets BevoegdGezag
        /// </summary>
        [DataMember(Name="bevoegdGezag", EmitDefaultValue=false)]
        public HalLink BevoegdGezag { get; set; }

        /// <summary>
        /// Gets or Sets Stukken
        /// </summary>
        [DataMember(Name="stukken", EmitDefaultValue=false)]
        public List<HalLink> Stukken { get; set; }

        /// <summary>
        /// Gets or Sets IsGebaseerdOpStukdeel
        /// </summary>
        [DataMember(Name="isGebaseerdOpStukdeel", EmitDefaultValue=false)]
        public HalLink IsGebaseerdOpStukdeel { get; set; }

        /// <summary>
        /// Gets or Sets IsVermeldInStukdelen
        /// </summary>
        [DataMember(Name="isVermeldInStukdelen", EmitDefaultValue=false)]
        public List<HalLink> IsVermeldInStukdelen { get; set; }

        /// <summary>
        /// Gets or Sets KadastraalOnroerendeZaak
        /// </summary>
        [DataMember(Name="kadastraalOnroerendeZaak", EmitDefaultValue=false)]
        public List<HalLink> KadastraalOnroerendeZaak { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PubliekrechtelijkeBeperkingLinks {\n");
            sb.Append("  BevoegdGezag: ").Append(BevoegdGezag).Append("\n");
            sb.Append("  Stukken: ").Append(Stukken).Append("\n");
            sb.Append("  IsGebaseerdOpStukdeel: ").Append(IsGebaseerdOpStukdeel).Append("\n");
            sb.Append("  IsVermeldInStukdelen: ").Append(IsVermeldInStukdelen).Append("\n");
            sb.Append("  KadastraalOnroerendeZaak: ").Append(KadastraalOnroerendeZaak).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as PubliekrechtelijkeBeperkingLinks);
        }

        /// <summary>
        /// Returns true if PubliekrechtelijkeBeperkingLinks instances are equal
        /// </summary>
        /// <param name="input">Instance of PubliekrechtelijkeBeperkingLinks to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PubliekrechtelijkeBeperkingLinks input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.BevoegdGezag == input.BevoegdGezag ||
                    (this.BevoegdGezag != null &&
                    this.BevoegdGezag.Equals(input.BevoegdGezag))
                ) && 
                (
                    this.Stukken == input.Stukken ||
                    this.Stukken != null &&
                    input.Stukken != null &&
                    this.Stukken.SequenceEqual(input.Stukken)
                ) && 
                (
                    this.IsGebaseerdOpStukdeel == input.IsGebaseerdOpStukdeel ||
                    (this.IsGebaseerdOpStukdeel != null &&
                    this.IsGebaseerdOpStukdeel.Equals(input.IsGebaseerdOpStukdeel))
                ) && 
                (
                    this.IsVermeldInStukdelen == input.IsVermeldInStukdelen ||
                    this.IsVermeldInStukdelen != null &&
                    input.IsVermeldInStukdelen != null &&
                    this.IsVermeldInStukdelen.SequenceEqual(input.IsVermeldInStukdelen)
                ) && 
                (
                    this.KadastraalOnroerendeZaak == input.KadastraalOnroerendeZaak ||
                    this.KadastraalOnroerendeZaak != null &&
                    input.KadastraalOnroerendeZaak != null &&
                    this.KadastraalOnroerendeZaak.SequenceEqual(input.KadastraalOnroerendeZaak)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.BevoegdGezag != null)
                    hashCode = hashCode * 59 + this.BevoegdGezag.GetHashCode();
                if (this.Stukken != null)
                    hashCode = hashCode * 59 + this.Stukken.GetHashCode();
                if (this.IsGebaseerdOpStukdeel != null)
                    hashCode = hashCode * 59 + this.IsGebaseerdOpStukdeel.GetHashCode();
                if (this.IsVermeldInStukdelen != null)
                    hashCode = hashCode * 59 + this.IsVermeldInStukdelen.GetHashCode();
                if (this.KadastraalOnroerendeZaak != null)
                    hashCode = hashCode * 59 + this.KadastraalOnroerendeZaak.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
