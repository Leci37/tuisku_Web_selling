//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: DOTUSDT_30Min_2BM0_5077afb5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_30Min_2BM0_5077afb5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_30Min_5077afb5(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bearPower <= -0.083627 )
		if( MFI <= 56.7567 )
			if( Typical_Price <= 6.5405 )
				if( Positive_Money_Flow_Sum <= 2.51817e+06 )
					if( MFI <= 22.102 )
						if( Money_Flow_Ratio <= 0.175122 )
							if( MFI_Low <= -15.2187 )
								if( Raw_Money_Flow <= 4.22788e+06 )
									ret := 0.656250
								if( Raw_Money_Flow > 4.22788e+06 )
									ret := 0.333333
							if( MFI_Low > -15.2187 )
								if( Negative_Money_Flow_Sum <= 1.6168e+07 )
									ret := -0.038922
								if( Negative_Money_Flow_Sum > 1.6168e+07 )
									ret := -0.650000
						if( Money_Flow_Ratio > 0.175122 )
							if( MFI_High <= -62.1369 )
								if( bullPower <= -0.092637 )
									ret := -0.222222
								if( bullPower > -0.092637 )
									ret := 0.609756
							if( MFI_High > -62.1369 )
								if( Typical_Price <= 4.18084 )
									ret := -0.102564
								if( Typical_Price > 4.18084 )
									ret := 0.259804
					if( MFI > 22.102 )
						if( Negative_Money_Flow_Sum <= 2.44955e+06 )
							if( Money_Flow_Ratio <= 0.643371 )
								if( MFI <= 32.035 )
									ret := -0.583333
								if( MFI > 32.035 )
									ret := -0.974359 // sell
							if( Money_Flow_Ratio > 0.643371 )
								ret := 0.400000
						if( Negative_Money_Flow_Sum > 2.44955e+06 )
							if( Typical_Price <= 5.78008 )
								if( Typical_Price <= 4.91017 )
									ret := 0.268293
								if( Typical_Price > 4.91017 )
									ret := -0.035714
							if( Typical_Price > 5.78008 )
								if( Typical_Price <= 6.22743 )
									ret := -0.541667
								if( Typical_Price > 6.22743 )
									ret := -0.192308
				if( Positive_Money_Flow_Sum > 2.51817e+06 )
					if( Raw_Money_Flow <= 701755 )
						if( Typical_Price <= 5.37487 )
							if( bearPower <= -0.095721 )
								if( MFI <= 27.3341 )
									ret := 0.466667
								if( MFI > 27.3341 )
									ret := -0.166667
							if( bearPower > -0.095721 )
								if( bearPower <= -0.085307 )
									ret := -0.627907
								if( bearPower > -0.085307 )
									ret := 0.000000
						if( Typical_Price > 5.37487 )
							if( Negative_Money_Flow <= 677891 )
								if( Typical_Price <= 6.45934 )
									ret := 0.253247
								if( Typical_Price > 6.45934 )
									ret := -0.625000
							if( Negative_Money_Flow > 677891 )
								ret := -0.700000 // sell
					if( Raw_Money_Flow > 701755 )
						if( Positive_Money_Flow <= 1.42717e+06 )
							if( Negative_Money_Flow <= 1.06018e+06 )
								if( bullPower <= -0.0529 )
									ret := 0.274112
								if( bullPower > -0.0529 )
									ret := 0.555825
							if( Negative_Money_Flow > 1.06018e+06 )
								if( Raw_Money_Flow <= 3.21016e+06 )
									ret := 0.215985
								if( Raw_Money_Flow > 3.21016e+06 )
									ret := 0.511737
						if( Positive_Money_Flow > 1.42717e+06 )
							if( bearPower <= -0.134165 )
								if( Money_Flow_Ratio <= 0.923458 )
									ret := 0.215470
								if( Money_Flow_Ratio > 0.923458 )
									ret := -0.588235
							if( bearPower > -0.134165 )
								if( bbp <= -0.128382 )
									ret := -0.075000
								if( bbp > -0.128382 )
									ret := -0.493151
			if( Typical_Price > 6.5405 )
				if( Positive_Money_Flow_Sum <= 7.623e+06 )
					if( Positive_Money_Flow_Sum <= 6.7203e+06 )
						if( Negative_Money_Flow_Sum <= 2.62691e+07 )
							if( bbm <= 0.171293 )
								if( Negative_Money_Flow_Sum <= 1.43245e+07 )
									ret := -0.017363
								if( Negative_Money_Flow_Sum > 1.43245e+07 )
									ret := 0.131693
							if( bbm > 0.171293 )
								if( Positive_Money_Flow_Sum <= 4.2349e+06 )
									ret := -0.474576
								if( Positive_Money_Flow_Sum > 4.2349e+06 )
									ret := -0.094276
						if( Negative_Money_Flow_Sum > 2.62691e+07 )
							if( bbm <= 0.866828 )
								if( bbm <= 0.310568 )
									ret := -0.311881
								if( bbm > 0.310568 )
									ret := -0.773333 // sell
							if( bbm > 0.866828 )
								if( MFI_High <= -75.471 )
									ret := 0.222222
								if( MFI_High > -75.471 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 6.7203e+06 )
						if( Money_Flow_Ratio <= 0.217339 )
							if( bullPower <= -0.181973 )
								if( bbp <= -1.13251 )
									ret := -0.800000 // sell
								if( bbp > -1.13251 )
									ret := -1.000000 // sell
							if( bullPower > -0.181973 )
								ret := -0.727273 // sell
						if( Money_Flow_Ratio > 0.217339 )
							if( Negative_Money_Flow <= 4.6513e+06 )
								if( Money_Flow_Ratio <= 0.377627 )
									ret := 0.055944
								if( Money_Flow_Ratio > 0.377627 )
									ret := -0.387187
							if( Negative_Money_Flow > 4.6513e+06 )
								if( Positive_Money_Flow_Sum <= 7.26329e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 7.26329e+06 )
									ret := 0.636364
				if( Positive_Money_Flow_Sum > 7.623e+06 )
					if( MFI_Low <= 5.60973 )
						if( Negative_Money_Flow <= 619051 )
							if( bearPower <= -1.82098 )
								if( Positive_Money_Flow <= 3.08682e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 3.08682e+07 )
									ret := -0.666667
							if( bearPower > -1.82098 )
								if( Typical_Price <= 13.8807 )
									ret := 0.362319
								if( Typical_Price > 13.8807 )
									ret := -0.085639
						if( Negative_Money_Flow > 619051 )
							if( bbp <= -2.22147 )
								if( Positive_Money_Flow_Sum <= 3.05667e+07 )
									ret := 0.196262
								if( Positive_Money_Flow_Sum > 3.05667e+07 )
									ret := 0.717742 // buy
							if( bbp > -2.22147 )
								if( Typical_Price <= 33.8886 )
									ret := 0.322191
								if( Typical_Price > 33.8886 )
									ret := -0.029703
					if( MFI_Low > 5.60973 )
						if( bbm <= 0.52324 )
							if( Negative_Money_Flow <= 6.79552e+06 )
								if( bearPower <= -0.456239 )
									ret := -0.133113
								if( bearPower > -0.456239 )
									ret := -0.007569
							if( Negative_Money_Flow > 6.79552e+06 )
								if( Negative_Money_Flow_Sum <= 4.23517e+07 )
									ret := 0.424528
								if( Negative_Money_Flow_Sum > 4.23517e+07 )
									ret := 0.051338
						if( bbm > 0.52324 )
							if( Positive_Money_Flow <= 83231.8 )
								if( Negative_Money_Flow_Sum <= 1.71592e+08 )
									ret := 0.148030
								if( Negative_Money_Flow_Sum > 1.71592e+08 )
									ret := 0.431767
							if( Positive_Money_Flow > 83231.8 )
								if( Negative_Money_Flow_Sum <= 3.9527e+08 )
									ret := -0.025113
								if( Negative_Money_Flow_Sum > 3.9527e+08 )
									ret := 0.545455
		if( MFI > 56.7567 )
			if( bbm <= 0.564896 )
				if( Positive_Money_Flow_Sum <= 1.59738e+08 )
					if( bullPower <= -0.047411 )
						if( Money_Flow_Ratio <= 1.43323 )
							if( Negative_Money_Flow_Sum <= 4.97325e+07 )
								if( Negative_Money_Flow_Sum <= 1.46765e+07 )
									ret := -0.600000
								if( Negative_Money_Flow_Sum > 1.46765e+07 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 4.97325e+07 )
								ret := 0.769231 // buy
						if( Money_Flow_Ratio > 1.43323 )
							if( bbp <= -0.530301 )
								ret := 0.238095
							if( bbp > -0.530301 )
								if( MFI <= 67.99 )
									ret := 0.693548
								if( MFI > 67.99 )
									ret := 1.000000 // buy
					if( bullPower > -0.047411 )
						if( Positive_Money_Flow_Sum <= 1.46272e+08 )
							if( Positive_Money_Flow <= 686332 )
								if( Positive_Money_Flow_Sum <= 5.19772e+07 )
									ret := 0.288119
								if( Positive_Money_Flow_Sum > 5.19772e+07 )
									ret := 0.000000
							if( Positive_Money_Flow > 686332 )
								if( Typical_Price <= 7.53933 )
									ret := -0.655172
								if( Typical_Price > 7.53933 )
									ret := 0.085132
						if( Positive_Money_Flow_Sum > 1.46272e+08 )
							if( Positive_Money_Flow <= 8.4174e+06 )
								ret := 0.818182 // buy
							if( Positive_Money_Flow > 8.4174e+06 )
								ret := 1.000000 // buy
				if( Positive_Money_Flow_Sum > 1.59738e+08 )
					if( Typical_Price <= 25.7558 )
						ret := -1.000000 // sell
					if( Typical_Price > 25.7558 )
						ret := -0.533333
			if( bbm > 0.564896 )
				if( bearPower <= -0.122498 )
					if( Raw_Money_Flow <= 1.29728e+07 )
						if( MFI <= 64.2452 )
							if( MFI_High <= -16.5396 )
								if( bbp <= 0.380766 )
									ret := 0.600000
								if( bbp > 0.380766 )
									ret := -0.187500
							if( MFI_High > -16.5396 )
								if( Negative_Money_Flow <= 2.26137e+06 )
									ret := 0.733333 // buy
								if( Negative_Money_Flow > 2.26137e+06 )
									ret := -0.777778 // sell
						if( MFI > 64.2452 )
							if( Positive_Money_Flow_Sum <= 1.09713e+08 )
								if( Typical_Price <= 35.1258 )
									ret := 0.693548
								if( Typical_Price > 35.1258 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 1.09713e+08 )
								if( BBPower_Color <= 0.5 )
									ret := 0.979167 // buy
								if( BBPower_Color > 0.5 )
									ret := 0.812500 // buy
					if( Raw_Money_Flow > 1.29728e+07 )
						if( MFI_High <= -7.06113 )
							if( bullPower <= 0.517636 )
								if( Positive_Money_Flow_Sum <= 2.3828e+08 )
									ret := 0.557895
								if( Positive_Money_Flow_Sum > 2.3828e+08 )
									ret := -0.428571
							if( bullPower > 0.517636 )
								if( Typical_Price <= 23.2511 )
									ret := 0.806452 // buy
								if( Typical_Price > 23.2511 )
									ret := 0.033557
						if( MFI_High > -7.06113 )
							if( Money_Flow_Ratio <= 3.15775 )
								ret := -0.846154 // sell
							if( Money_Flow_Ratio > 3.15775 )
								if( bearPower <= -0.193871 )
									ret := -0.066667
								if( bearPower > -0.193871 )
									ret := 0.142857
				if( bearPower > -0.122498 )
					if( Positive_Money_Flow_Sum <= 8.05061e+07 )
						if( bullPower <= 0.56036 )
							ret := 0.437500
						if( bullPower > 0.56036 )
							ret := -0.400000
					if( Positive_Money_Flow_Sum > 8.05061e+07 )
						if( bullPower <= 0.624828 )
							if( bbm <= 0.686108 )
								ret := -0.588235
							if( bbm > 0.686108 )
								ret := -1.000000 // sell
						if( bullPower > 0.624828 )
							if( bearPower <= -0.110159 )
								ret := -1.000000 // sell
							if( bearPower > -0.110159 )
								ret := 0.352941
	if( bearPower > -0.083627 )
		if( bbm <= 1.05703 )
			if( Positive_Money_Flow <= 862853 )
				if( Typical_Price <= 4.53105 )
					if( bearPower <= -0.028939 )
						if( MFI <= 16.6412 )
							if( MFI_Low <= -7.82659 )
								if( MFI_Low <= -13.2921 )
									ret := -0.500000
								if( MFI_Low > -13.2921 )
									ret := 0.142857
							if( MFI_Low > -7.82659 )
								if( Negative_Money_Flow_Sum <= 9.14286e+06 )
									ret := -0.257576
								if( Negative_Money_Flow_Sum > 9.14286e+06 )
									ret := -0.800000 // sell
						if( MFI > 16.6412 )
							if( Negative_Money_Flow_Sum <= 8.32781e+06 )
								if( bullPower <= -0.004585 )
									ret := 0.105836
								if( bullPower > -0.004585 )
									ret := 0.235747
							if( Negative_Money_Flow_Sum > 8.32781e+06 )
								if( Raw_Money_Flow <= 275151 )
									ret := 0.375000
								if( Raw_Money_Flow > 275151 )
									ret := -0.542857
					if( bearPower > -0.028939 )
						if( bbm <= 0.029776 )
							if( bbp <= -0.018588 )
								if( Positive_Money_Flow <= 302516 )
									ret := -0.109934
								if( Positive_Money_Flow > 302516 )
									ret := 0.266667
							if( bbp > -0.018588 )
								if( MFI_High <= -32.2454 )
									ret := 0.084828
								if( MFI_High > -32.2454 )
									ret := -0.037446
						if( bbm > 0.029776 )
							if( bbm <= 0.077 )
								if( MFI <= 49.3324 )
									ret := 0.241036
								if( MFI > 49.3324 )
									ret := 0.077885
							if( bbm > 0.077 )
								if( bbp <= 0.080208 )
									ret := -0.766667 // sell
								if( bbp > 0.080208 )
									ret := 0.375000
				if( Typical_Price > 4.53105 )
					if( bearPower <= -0.005652 )
						if( Negative_Money_Flow_Sum <= 2.14859e+06 )
							if( Typical_Price <= 5.66807 )
								if( bbm <= 0.041842 )
									ret := -0.142398
								if( bbm > 0.041842 )
									ret := -0.317901
							if( Typical_Price > 5.66807 )
								if( bearPower <= -0.005939 )
									ret := -0.046753
								if( bearPower > -0.005939 )
									ret := -0.476190
						if( Negative_Money_Flow_Sum > 2.14859e+06 )
							if( Positive_Money_Flow_Sum <= 1.08358e+06 )
								if( bearPower <= -0.070164 )
									ret := 0.073394
								if( bearPower > -0.070164 )
									ret := -0.220588
							if( Positive_Money_Flow_Sum > 1.08358e+06 )
								if( bbp <= -0.047387 )
									ret := -0.074340
								if( bbp > -0.047387 )
									ret := -0.007452
					if( bearPower > -0.005652 )
						if( MFI_High <= -24.28 )
							if( Typical_Price <= 4.77633 )
								if( MFI_Low <= 9.85187 )
									ret := 0.800000 // buy
								if( MFI_Low > 9.85187 )
									ret := -0.253275
							if( Typical_Price > 4.77633 )
								if( Positive_Money_Flow_Sum <= 6.46094e+06 )
									ret := 0.045060
								if( Positive_Money_Flow_Sum > 6.46094e+06 )
									ret := 0.209790
						if( MFI_High > -24.28 )
							if( Money_Flow_Ratio <= 1.69773 )
								if( Negative_Money_Flow <= 1.98237e+06 )
									ret := -0.050840
								if( Negative_Money_Flow > 1.98237e+06 )
									ret := -0.219725
							if( Money_Flow_Ratio > 1.69773 )
								if( MFI_Low <= 44.3596 )
									ret := 0.172519
								if( MFI_Low > 44.3596 )
									ret := 0.001457
			if( Positive_Money_Flow > 862853 )
				if( Raw_Money_Flow <= 2.4939e+07 )
					if( Typical_Price <= 36.7117 )
						if( Positive_Money_Flow_Sum <= 1.23754e+08 )
							if( Raw_Money_Flow <= 7.83072e+06 )
								if( bearPower <= 0.420045 )
									ret := -0.061929
								if( bearPower > 0.420045 )
									ret := -0.406015
							if( Raw_Money_Flow > 7.83072e+06 )
								if( Positive_Money_Flow_Sum <= 3.64812e+07 )
									ret := 0.443709
								if( Positive_Money_Flow_Sum > 3.64812e+07 )
									ret := 0.033283
						if( Positive_Money_Flow_Sum > 1.23754e+08 )
							if( Positive_Money_Flow <= 1.32538e+07 )
								if( bbm <= 0.308396 )
									ret := -0.822222 // sell
								if( bbm > 0.308396 )
									ret := -0.378182
							if( Positive_Money_Flow > 1.32538e+07 )
								if( Positive_Money_Flow_Sum <= 2.00772e+08 )
									ret := -0.264706
								if( Positive_Money_Flow_Sum > 2.00772e+08 )
									ret := 0.449275
					if( Typical_Price > 36.7117 )
						if( bbm <= 0.477637 )
							if( Money_Flow_Ratio <= 4.49118 )
								if( Negative_Money_Flow_Sum <= 8.19544e+07 )
									ret := -0.290566
								if( Negative_Money_Flow_Sum > 8.19544e+07 )
									ret := 0.216216
							if( Money_Flow_Ratio > 4.49118 )
								if( MFI_High <= 7.65724 )
									ret := 0.281250
								if( MFI_High > 7.65724 )
									ret := -0.111111
						if( bbm > 0.477637 )
							if( Raw_Money_Flow <= 6.92292e+06 )
								if( bearPower <= -0.030162 )
									ret := -0.866667 // sell
								if( bearPower > -0.030162 )
									ret := -0.555556
							if( Raw_Money_Flow > 6.92292e+06 )
								if( MFI <= 75.339 )
									ret := -0.259259
								if( MFI > 75.339 )
									ret := -0.513274
				if( Raw_Money_Flow > 2.4939e+07 )
					if( Typical_Price <= 22.7488 )
						if( MFI_High <= -10.3541 )
							ret := 0.421053
						if( MFI_High > -10.3541 )
							if( Positive_Money_Flow <= 2.97674e+07 )
								ret := -0.333333
							if( Positive_Money_Flow > 2.97674e+07 )
								if( Money_Flow_Ratio <= 3.19202 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 3.19202 )
									ret := -0.818182 // sell
					if( Typical_Price > 22.7488 )
						if( MFI_High <= -12.6218 )
							if( MFI_High <= -18.5993 )
								if( Negative_Money_Flow_Sum <= 9.7199e+07 )
									ret := 0.900000 // buy
								if( Negative_Money_Flow_Sum > 9.7199e+07 )
									ret := 0.400000
							if( MFI_High > -18.5993 )
								if( Money_Flow_Ratio <= 1.95605 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 1.95605 )
									ret := -0.750000 // sell
						if( MFI_High > -12.6218 )
							if( MFI <= 86.4224 )
								if( bbm <= 0.989794 )
									ret := 0.790323 // buy
								if( bbm > 0.989794 )
									ret := 0.000000
							if( MFI > 86.4224 )
								if( Negative_Money_Flow_Sum <= 3.29378e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 3.29378e+07 )
									ret := 0.818182 // buy
		if( bbm > 1.05703 )
			if( MFI <= 78.6673 )
				if( MFI_High <= -17.1822 )
					if( Raw_Money_Flow <= 2.18762e+07 )
						if( MFI_High <= -21.9825 )
							ret := 0.142857
						if( MFI_High > -21.9825 )
							ret := 0.750000 // buy
					if( Raw_Money_Flow > 2.18762e+07 )
						if( Positive_Money_Flow <= 4.18244e+07 )
							if( MFI_Low <= 41.1249 )
								if( Raw_Money_Flow <= 3.18148e+07 )
									ret := -0.868421 // sell
								if( Raw_Money_Flow > 3.18148e+07 )
									ret := -0.300000
							if( MFI_Low > 41.1249 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow > 4.18244e+07 )
							ret := -0.272727
				if( MFI_High > -17.1822 )
					if( bbp <= 2.16387 )
						if( Raw_Money_Flow <= 4.33862e+07 )
							if( Typical_Price <= 42.0587 )
								if( MFI <= 67.5087 )
									ret := -0.677419
								if( MFI > 67.5087 )
									ret := -0.173913
							if( Typical_Price > 42.0587 )
								ret := 0.636364
						if( Raw_Money_Flow > 4.33862e+07 )
							ret := -0.941176 // sell
					if( bbp > 2.16387 )
						if( MFI_High <= -2.95336 )
							if( Positive_Money_Flow <= 4.50258e+07 )
								if( Positive_Money_Flow <= 3.77089e+07 )
									ret := -0.947368 // sell
								if( Positive_Money_Flow > 3.77089e+07 )
									ret := -0.823529 // sell
							if( Positive_Money_Flow > 4.50258e+07 )
								ret := -1.000000 // sell
						if( MFI_High > -2.95336 )
							ret := -0.647059
			if( MFI > 78.6673 )
				if( Negative_Money_Flow_Sum <= 4.79525e+07 )
					if( Positive_Money_Flow <= 6.30295e+07 )
						if( Raw_Money_Flow <= 3.75815e+07 )
							if( bbm <= 1.2302 )
								ret := 0.600000
							if( bbm > 1.2302 )
								ret := -0.181818
						if( Raw_Money_Flow > 3.75815e+07 )
							if( bbm <= 1.48825 )
								ret := 0.750000 // buy
							if( bbm > 1.48825 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow > 6.30295e+07 )
						ret := -0.636364
				if( Negative_Money_Flow_Sum > 4.79525e+07 )
					if( Typical_Price <= 41.64 )
						if( Negative_Money_Flow <= 1.123e+07 )
							if( bearPower <= 0.598457 )
								ret := -1.000000 // sell
							if( bearPower > 0.598457 )
								ret := -0.777778 // sell
						if( Negative_Money_Flow > 1.123e+07 )
							ret := 1.000000 // buy
					if( Typical_Price > 41.64 )
						if( bbp <= 3.50611 )
							ret := -0.555556
						if( bbp > 3.50611 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_DOTUSDT_30Min_5077afb5(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


