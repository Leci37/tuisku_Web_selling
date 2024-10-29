//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: ADAUSDT_30Min_2MT0_ccefd99f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_30Min_2MT0_ccefd99f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_30Min_ccefd99f(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema1 <= 0.465723 )
		if( Negative_Money_Flow_Sum <= 1.68614e+07 )
			if( Positive_Money_Flow <= 1.78517e+06 )
				if( ema3 <= 0.096393 )
					if( MFI_High <= -42.9184 )
						if( Negative_Money_Flow <= 367826 )
							if( ema2 <= 0.08945 )
								if( Typical_Price <= 0.081318 )
									ret := -0.200000
								if( Typical_Price > 0.081318 )
									ret := -0.828571 // sell
							if( ema2 > 0.08945 )
								if( Money_Flow_Ratio <= 0.364602 )
									ret := 0.200000
								if( Money_Flow_Ratio > 0.364602 )
									ret := -0.333333
						if( Negative_Money_Flow > 367826 )
							if( Positive_Money_Flow_Sum <= 2.75836e+06 )
								if( MFI <= 19.1818 )
									ret := 0.406250
								if( MFI > 19.1818 )
									ret := -0.038462
							if( Positive_Money_Flow_Sum > 2.75836e+06 )
								if( Raw_Money_Flow <= 829772 )
									ret := 0.904762 // buy
								if( Raw_Money_Flow > 829772 )
									ret := 0.444444
					if( MFI_High > -42.9184 )
						if( Positive_Money_Flow <= 509827 )
							if( Negative_Money_Flow <= 238886 )
								if( Positive_Money_Flow_Sum <= 4.49084e+06 )
									ret := 0.210227
								if( Positive_Money_Flow_Sum > 4.49084e+06 )
									ret := -0.171875
							if( Negative_Money_Flow > 238886 )
								if( Money_Flow_Ratio <= 1.547 )
									ret := 0.478964
								if( Money_Flow_Ratio > 1.547 )
									ret := 0.115108
						if( Positive_Money_Flow > 509827 )
							if( Positive_Money_Flow_Sum <= 3.03748e+06 )
								if( ema3 <= 0.093636 )
									ret := 0.095238
								if( ema3 > 0.093636 )
									ret := 0.500000
							if( Positive_Money_Flow_Sum > 3.03748e+06 )
								if( Positive_Money_Flow <= 548898 )
									ret := -0.666667
								if( Positive_Money_Flow > 548898 )
									ret := -0.125828
				if( ema3 > 0.096393 )
					if( tema <= 0.095616 )
						if( ema2 <= 0.09681 )
							if( Money_Flow_Ratio <= 0.434472 )
								if( Money_Flow_Ratio <= 0.241338 )
									ret := 0.090909
								if( Money_Flow_Ratio > 0.241338 )
									ret := 0.315789
							if( Money_Flow_Ratio > 0.434472 )
								ret := -0.500000
						if( ema2 > 0.09681 )
							if( Raw_Money_Flow <= 676098 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 676098 )
								ret := -0.300000
					if( tema > 0.095616 )
						if( Positive_Money_Flow <= 1.58032e+06 )
							if( ema3 <= 0.468834 )
								if( Negative_Money_Flow <= 6.29787e+06 )
									ret := 0.008321
								if( Negative_Money_Flow > 6.29787e+06 )
									ret := 0.490196
							if( ema3 > 0.468834 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow > 1.58032e+06 )
							if( Typical_Price <= 0.296107 )
								if( Positive_Money_Flow_Sum <= 4.5234e+06 )
									ret := 0.266667
								if( Positive_Money_Flow_Sum > 4.5234e+06 )
									ret := -0.580882
							if( Typical_Price > 0.296107 )
								if( Money_Flow_Ratio <= 2.27703 )
									ret := -0.206642
								if( Money_Flow_Ratio > 2.27703 )
									ret := 0.139860
			if( Positive_Money_Flow > 1.78517e+06 )
				if( ema13 <= 0.011169 )
					if( MFI <= 53.013 )
						if( Positive_Money_Flow_Sum <= 1.34338e+07 )
							if( MFI <= 50.2895 )
								if( Negative_Money_Flow_Sum <= 1.30059e+07 )
									ret := 0.111111
								if( Negative_Money_Flow_Sum > 1.30059e+07 )
									ret := -0.261261
							if( MFI > 50.2895 )
								if( Typical_Price <= 0.460562 )
									ret := -0.645833
								if( Typical_Price > 0.460562 )
									ret := 0.066667
						if( Positive_Money_Flow_Sum > 1.34338e+07 )
							if( ema2 <= 0.339462 )
								ret := 0.750000 // buy
							if( ema2 > 0.339462 )
								ret := 0.473684
					if( MFI > 53.013 )
						if( tema <= 0.389746 )
							if( Raw_Money_Flow <= 9.14984e+06 )
								if( MFI_Low <= 36.6474 )
									ret := 0.634921
								if( MFI_Low > 36.6474 )
									ret := 0.205545
							if( Raw_Money_Flow > 9.14984e+06 )
								if( Positive_Money_Flow <= 1.08266e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 1.08266e+07 )
									ret := 0.250000
						if( tema > 0.389746 )
							if( MFI_High <= -7.5737 )
								if( Raw_Money_Flow <= 2.30159e+06 )
									ret := 0.533333
								if( Raw_Money_Flow > 2.30159e+06 )
									ret := 0.055085
							if( MFI_High > -7.5737 )
								if( Negative_Money_Flow_Sum <= 3.05024e+06 )
									ret := 0.227273
								if( Negative_Money_Flow_Sum > 3.05024e+06 )
									ret := -0.286275
				if( ema13 > 0.011169 )
					if( Negative_Money_Flow_Sum <= 1.47394e+07 )
						if( Positive_Money_Flow_Sum <= 3.8273e+07 )
							if( ema3 <= 0.3814 )
								ret := -0.045455
							if( ema3 > 0.3814 )
								ret := -0.625000
						if( Positive_Money_Flow_Sum > 3.8273e+07 )
							if( Typical_Price <= 0.37495 )
								ret := -0.500000
							if( Typical_Price > 0.37495 )
								if( Positive_Money_Flow <= 6.48765e+06 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 6.48765e+06 )
									ret := -0.750000 // sell
					if( Negative_Money_Flow_Sum > 1.47394e+07 )
						ret := 1.000000 // buy
		if( Negative_Money_Flow_Sum > 1.68614e+07 )
			if( MFI_Low <= 29.5964 )
				if( Negative_Money_Flow <= 7.6038e+06 )
					if( Negative_Money_Flow <= 3.1857e+06 )
						if( Money_Flow_Ratio <= 0.218133 )
							if( Positive_Money_Flow <= 727513 )
								if( ema3 <= 0.401567 )
									ret := 0.029412
								if( ema3 > 0.401567 )
									ret := 0.465909
							if( Positive_Money_Flow > 727513 )
								if( ema1 <= 0.406189 )
									ret := -0.560440
								if( ema1 > 0.406189 )
									ret := 0.133333
						if( Money_Flow_Ratio > 0.218133 )
							if( Negative_Money_Flow <= 870601 )
								if( Negative_Money_Flow_Sum <= 7.06672e+07 )
									ret := 0.171088
								if( Negative_Money_Flow_Sum > 7.06672e+07 )
									ret := 0.577982
							if( Negative_Money_Flow > 870601 )
								if( Negative_Money_Flow_Sum <= 3.43018e+07 )
									ret := 0.498845
								if( Negative_Money_Flow_Sum > 3.43018e+07 )
									ret := -0.155738
					if( Negative_Money_Flow > 3.1857e+06 )
						if( Money_Flow_Ratio <= 0.494778 )
							if( ema13 <= -0.0101 )
								if( ema12 <= -0.006932 )
									ret := 0.900000 // buy
								if( ema12 > -0.006932 )
									ret := 0.600000
							if( ema13 > -0.0101 )
								if( Positive_Money_Flow_Sum <= 2.69684e+06 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 2.69684e+06 )
									ret := 0.076923
						if( Money_Flow_Ratio > 0.494778 )
							if( Negative_Money_Flow_Sum <= 7.67996e+07 )
								if( Typical_Price <= 0.439007 )
									ret := -0.276224
								if( Typical_Price > 0.439007 )
									ret := 0.372093
							if( Negative_Money_Flow_Sum > 7.67996e+07 )
								ret := 1.000000 // buy
				if( Negative_Money_Flow > 7.6038e+06 )
					if( MFI_Low <= 13.4232 )
						if( ema12 <= -0.005376 )
							if( ema3 <= 0.297532 )
								ret := 0.666667
							if( ema3 > 0.297532 )
								if( ema1 <= 0.348684 )
									ret := 0.906250 // buy
								if( ema1 > 0.348684 )
									ret := 1.000000 // buy
						if( ema12 > -0.005376 )
							if( Positive_Money_Flow_Sum <= 5.07005e+06 )
								ret := 0.181818
							if( Positive_Money_Flow_Sum > 5.07005e+06 )
								if( ema1 <= 0.296422 )
									ret := 1.000000 // buy
								if( ema1 > 0.296422 )
									ret := 0.684211
					if( MFI_Low > 13.4232 )
						if( MFI <= 40.0823 )
							if( Negative_Money_Flow <= 1.23599e+07 )
								ret := -0.055556
							if( Negative_Money_Flow > 1.23599e+07 )
								ret := 0.250000
						if( MFI > 40.0823 )
							if( ema1 <= 0.309878 )
								if( Money_Flow_Ratio <= 0.765421 )
									ret := 0.125000
								if( Money_Flow_Ratio > 0.765421 )
									ret := 0.750000 // buy
							if( ema1 > 0.309878 )
								if( Money_Flow_Ratio <= 0.849605 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.849605 )
									ret := 0.571429
			if( MFI_Low > 29.5964 )
				if( MFI_High <= -29.6113 )
					if( ema13 <= -0.003056 )
						ret := 0.357143
					if( ema13 > -0.003056 )
						if( Negative_Money_Flow <= 2.58025e+06 )
							if( Negative_Money_Flow_Sum <= 1.97806e+07 )
								ret := -0.166667
							if( Negative_Money_Flow_Sum > 1.97806e+07 )
								if( Money_Flow_Ratio <= 0.989973 )
									ret := -0.454545
								if( Money_Flow_Ratio > 0.989973 )
									ret := -0.934783 // sell
						if( Negative_Money_Flow > 2.58025e+06 )
							if( ema3 <= 0.236658 )
								ret := 0.750000 // buy
							if( ema3 > 0.236658 )
								ret := -0.266667
				if( MFI_High > -29.6113 )
					if( Positive_Money_Flow_Sum <= 2.37368e+07 )
						if( ema2 <= 0.436258 )
							if( Negative_Money_Flow_Sum <= 1.77922e+07 )
								if( Money_Flow_Ratio <= 1.15354 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 1.15354 )
									ret := 0.700000 // buy
							if( Negative_Money_Flow_Sum > 1.77922e+07 )
								if( Positive_Money_Flow_Sum <= 2.28165e+07 )
									ret := 0.076923
								if( Positive_Money_Flow_Sum > 2.28165e+07 )
									ret := 0.869565 // buy
						if( ema2 > 0.436258 )
							ret := 0.111111
					if( Positive_Money_Flow_Sum > 2.37368e+07 )
						if( MFI <= 54.5515 )
							if( ema3 <= 0.295663 )
								if( MFI_Low <= 32.2685 )
									ret := -0.121212
								if( MFI_Low > 32.2685 )
									ret := -0.846154 // sell
							if( ema3 > 0.295663 )
								if( MFI_Low <= 31.5529 )
									ret := 0.406780
								if( MFI_Low > 31.5529 )
									ret := -0.330579
						if( MFI > 54.5515 )
							if( Positive_Money_Flow <= 6.58968e+06 )
								if( Negative_Money_Flow_Sum <= 1.9135e+07 )
									ret := -0.248485
								if( Negative_Money_Flow_Sum > 1.9135e+07 )
									ret := 0.162637
							if( Positive_Money_Flow > 6.58968e+06 )
								if( ema13 <= 0.012026 )
									ret := -0.078534
								if( ema13 > 0.012026 )
									ret := -0.701754 // sell
	if( ema1 > 0.465723 )
		if( Positive_Money_Flow <= 383246 )
			if( ema13 <= -0.011298 )
				if( tema <= 1.23645 )
					if( Negative_Money_Flow <= 1.7525e+07 )
						if( ema3 <= 1.20999 )
							if( Positive_Money_Flow_Sum <= 2.47902e+07 )
								if( MFI <= 18.1552 )
									ret := 0.073563
								if( MFI > 18.1552 )
									ret := 0.346099
							if( Positive_Money_Flow_Sum > 2.47902e+07 )
								if( Money_Flow_Ratio <= 0.312308 )
									ret := 0.632911
								if( Money_Flow_Ratio > 0.312308 )
									ret := -0.059567
						if( ema3 > 1.20999 )
							if( MFI <= 36.8965 )
								if( MFI <= 19.0651 )
									ret := 0.638298
								if( MFI > 19.0651 )
									ret := 0.204724
							if( MFI > 36.8965 )
								if( Typical_Price <= 1.2216 )
									ret := 0.911111 // buy
								if( Typical_Price > 1.2216 )
									ret := 0.666667
					if( Negative_Money_Flow > 1.7525e+07 )
						if( Negative_Money_Flow_Sum <= 7.80838e+07 )
							if( ema12 <= -0.013969 )
								ret := -0.833333 // sell
							if( ema12 > -0.013969 )
								ret := 0.133333
						if( Negative_Money_Flow_Sum > 7.80838e+07 )
							if( MFI <= 33.8599 )
								if( MFI_High <= -46.9656 )
									ret := 0.770588 // buy
								if( MFI_High > -46.9656 )
									ret := 1.000000 // buy
							if( MFI > 33.8599 )
								if( ema13 <= -0.032512 )
									ret := 0.803922 // buy
								if( ema13 > -0.032512 )
									ret := 0.000000
				if( tema > 1.23645 )
					if( MFI <= 9.17336 )
						if( Raw_Money_Flow <= 6.61123e+07 )
							if( tema <= 1.46654 )
								ret := 1.000000 // buy
							if( tema > 1.46654 )
								ret := 0.705882 // buy
						if( Raw_Money_Flow > 6.61123e+07 )
							ret := 0.538462
					if( MFI > 9.17336 )
						if( Money_Flow_Ratio <= 0.225064 )
							if( Typical_Price <= 1.45558 )
								if( Typical_Price <= 1.40199 )
									ret := 0.076923
								if( Typical_Price > 1.40199 )
									ret := 0.925926 // buy
							if( Typical_Price > 1.45558 )
								if( ema12 <= -0.022036 )
									ret := -0.093750
								if( ema12 > -0.022036 )
									ret := -0.556522
						if( Money_Flow_Ratio > 0.225064 )
							if( ema12 <= -0.055501 )
								if( Money_Flow_Ratio <= 0.351308 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.351308 )
									ret := 0.800000 // buy
							if( ema12 > -0.055501 )
								if( Negative_Money_Flow <= 1.0728e+07 )
									ret := -0.023742
								if( Negative_Money_Flow > 1.0728e+07 )
									ret := 0.194444
			if( ema13 > -0.011298 )
				if( Negative_Money_Flow <= 7.80032e+06 )
					if( Raw_Money_Flow <= 3.21104e+06 )
						if( ema12 <= 0.003094 )
							if( MFI <= 65.3526 )
								if( Positive_Money_Flow_Sum <= 3.7761e+06 )
									ret := 0.130125
								if( Positive_Money_Flow_Sum > 3.7761e+06 )
									ret := -0.035361
							if( MFI > 65.3526 )
								if( tema <= 1.3431 )
									ret := -0.206944
								if( tema > 1.3431 )
									ret := 0.823529 // buy
						if( ema12 > 0.003094 )
							if( ema3 <= 0.477248 )
								if( Positive_Money_Flow_Sum <= 1.90292e+07 )
									ret := 0.111111
								if( Positive_Money_Flow_Sum > 1.90292e+07 )
									ret := -0.660000
							if( ema3 > 0.477248 )
								if( MFI_Low <= 60.4543 )
									ret := 0.154941
								if( MFI_Low > 60.4543 )
									ret := 0.542857
					if( Raw_Money_Flow > 3.21104e+06 )
						if( ema13 <= 0.01644 )
							if( Raw_Money_Flow <= 4.91307e+06 )
								if( Negative_Money_Flow_Sum <= 7.49629e+07 )
									ret := -0.160550
								if( Negative_Money_Flow_Sum > 7.49629e+07 )
									ret := 0.571429
							if( Raw_Money_Flow > 4.91307e+06 )
								if( Positive_Money_Flow_Sum <= 4.19441e+07 )
									ret := 0.089783
								if( Positive_Money_Flow_Sum > 4.19441e+07 )
									ret := -0.162482
						if( ema13 > 0.01644 )
							if( ema3 <= 0.596194 )
								if( MFI <= 64.0491 )
									ret := 0.076923
								if( MFI > 64.0491 )
									ret := 0.789474 // buy
							if( ema3 > 0.596194 )
								if( Negative_Money_Flow <= 6.76653e+06 )
									ret := 0.129380
								if( Negative_Money_Flow > 6.76653e+06 )
									ret := -0.241935
				if( Negative_Money_Flow > 7.80032e+06 )
					if( tema <= 2.14301 )
						if( Positive_Money_Flow_Sum <= 5.1849e+08 )
							if( ema1 <= 2.11038 )
								if( MFI_High <= 4.91213 )
									ret := 0.116156
								if( MFI_High > 4.91213 )
									ret := -0.750000 // sell
							if( ema1 > 2.11038 )
								if( MFI <= 44.9869 )
									ret := 1.000000 // buy
								if( MFI > 44.9869 )
									ret := 0.315789
						if( Positive_Money_Flow_Sum > 5.1849e+08 )
							if( ema2 <= 1.39114 )
								if( Negative_Money_Flow <= 6.96865e+07 )
									ret := 0.687500
								if( Negative_Money_Flow > 6.96865e+07 )
									ret := -0.636364
							if( ema2 > 1.39114 )
								if( Money_Flow_Ratio <= 1.91158 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 1.91158 )
									ret := 0.600000
					if( tema > 2.14301 )
						if( ema13 <= 0.052061 )
							if( MFI <= 70.159 )
								if( Typical_Price <= 2.14867 )
									ret := -0.818182 // sell
								if( Typical_Price > 2.14867 )
									ret := -0.276398
							if( MFI > 70.159 )
								if( MFI_High <= -7.71383 )
									ret := 0.928571 // buy
								if( MFI_High > -7.71383 )
									ret := 0.200000
						if( ema13 > 0.052061 )
							if( tema <= 2.24911 )
								ret := -0.500000
							if( tema > 2.24911 )
								if( MFI <= 77.3345 )
									ret := 0.545455
								if( MFI > 77.3345 )
									ret := 0.100000
		if( Positive_Money_Flow > 383246 )
			if( MFI_High <= 11.7256 )
				if( ema12 <= 0.014824 )
					if( Negative_Money_Flow_Sum <= 5.37416e+06 )
						if( ema12 <= 0.00445 )
							if( Negative_Money_Flow_Sum <= 3.80427e+06 )
								if( tema <= 0.547772 )
									ret := 0.142241
								if( tema > 0.547772 )
									ret := -0.181208
							if( Negative_Money_Flow_Sum > 3.80427e+06 )
								if( MFI <= 78.9339 )
									ret := -0.316973
								if( MFI > 78.9339 )
									ret := 0.146341
						if( ema12 > 0.00445 )
							if( Money_Flow_Ratio <= 10.0021 )
								if( MFI_Low <= 53.6209 )
									ret := 0.000000
								if( MFI_Low > 53.6209 )
									ret := -0.624490
							if( Money_Flow_Ratio > 10.0021 )
								ret := 0.727273 // buy
					if( Negative_Money_Flow_Sum > 5.37416e+06 )
						if( Positive_Money_Flow_Sum <= 1.20244e+08 )
							if( ema3 <= 1.30955 )
								if( Positive_Money_Flow_Sum <= 7.54844e+06 )
									ret := -0.152030
								if( Positive_Money_Flow_Sum > 7.54844e+06 )
									ret := -0.026664
							if( ema3 > 1.30955 )
								if( Money_Flow_Ratio <= 0.520758 )
									ret := -0.315056
								if( Money_Flow_Ratio > 0.520758 )
									ret := -0.116877
						if( Positive_Money_Flow_Sum > 1.20244e+08 )
							if( Money_Flow_Ratio <= 4.63227 )
								if( Negative_Money_Flow_Sum <= 2.1382e+08 )
									ret := 0.179487
								if( Negative_Money_Flow_Sum > 2.1382e+08 )
									ret := -0.107558
							if( Money_Flow_Ratio > 4.63227 )
								if( Positive_Money_Flow <= 1.52603e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 1.52603e+07 )
									ret := -0.562500
				if( ema12 > 0.014824 )
					if( MFI_Low <= 62.3105 )
						if( MFI <= 75.2273 )
							if( Money_Flow_Ratio <= 2.86848 )
								if( Negative_Money_Flow_Sum <= 2.45083e+07 )
									ret := 0.850000 // buy
								if( Negative_Money_Flow_Sum > 2.45083e+07 )
									ret := -0.246717
							if( Money_Flow_Ratio > 2.86848 )
								if( ema3 <= 1.79295 )
									ret := -0.837209 // sell
								if( ema3 > 1.79295 )
									ret := -0.130435
						if( MFI > 75.2273 )
							if( MFI_Low <= 60.6953 )
								if( MFI_Low <= 58.0949 )
									ret := 0.000000
								if( MFI_Low > 58.0949 )
									ret := 0.439306
							if( MFI_Low > 60.6953 )
								if( ema1 <= 0.89598 )
									ret := 0.846154 // buy
								if( ema1 > 0.89598 )
									ret := -0.409449
					if( MFI_Low > 62.3105 )
						if( Typical_Price <= 2.6693 )
							if( ema2 <= 2.12383 )
								if( Negative_Money_Flow_Sum <= 6.40902e+07 )
									ret := -0.638889
								if( Negative_Money_Flow_Sum > 6.40902e+07 )
									ret := -0.230769
							if( ema2 > 2.12383 )
								if( MFI <= 85.8087 )
									ret := -0.814815 // sell
								if( MFI > 85.8087 )
									ret := 0.205128
						if( Typical_Price > 2.6693 )
							ret := 0.550000
			if( MFI_High > 11.7256 )
				if( Money_Flow_Ratio <= 14.2528 )
					if( MFI_High <= 12.7587 )
						if( MFI <= 92.5625 )
							if( Negative_Money_Flow_Sum <= 2.81956e+06 )
								ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 2.81956e+06 )
								ret := 0.100000
						if( MFI > 92.5625 )
							ret := 0.785714 // buy
					if( MFI_High > 12.7587 )
						if( MFI_High <= 13.0047 )
							ret := -0.142857
						if( MFI_High > 13.0047 )
							ret := 0.250000
				if( Money_Flow_Ratio > 14.2528 )
					if( Positive_Money_Flow_Sum <= 1.78445e+08 )
						if( Negative_Money_Flow_Sum <= 1.94766e+06 )
							if( MFI_Low <= 73.9512 )
								ret := 1.000000 // buy
							if( MFI_Low > 73.9512 )
								if( Raw_Money_Flow <= 3.8947e+06 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 3.8947e+06 )
									ret := 0.294118
						if( Negative_Money_Flow_Sum > 1.94766e+06 )
							if( Money_Flow_Ratio <= 19.7797 )
								ret := 0.666667
							if( Money_Flow_Ratio > 19.7797 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 1.78445e+08 )
						ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_ADAUSDT_30Min_ccefd99f(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)

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


