/*
 * Attribution
 * CC BY
 * This license lets others distribute, remix, tweak,
 * and build upon your work, even commercially,
 * as long as they credit you for the original creation.
 * This is the most accommodating of licenses offered.
 * Recommended for maximum dissemination and use of licensed materials.
 *
 * http://creativecommons.org/licenses/by/3.0/
 * http://creativecommons.org/licenses/by/3.0/legalcode
 */
package com.thjug.report.homeloan;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * month Input in range format. Ex 1-36 means Rate for month 1 - month 6
 * rate  Interest Rate Percent. Ex 5.25%
 *
 * @author @nuboat
 */
public final class InterestRate implements Serializable {

    private String month;
    private BigDecimal rate;

	public InterestRate() {}

	public InterestRate(final String month, final BigDecimal rate) {
		this.month = month;
		this.rate = rate;
	}

	public String getMonth() {
		return month;
	}

	public BigDecimal getRate() {
		return rate;
	}

}
