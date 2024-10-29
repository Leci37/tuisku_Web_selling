//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: QCOM_1Min_2MT0_0fc1f739 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_QCOM_1Min_2MT0_0fc1f739", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_QCOM_1Min_0fc1f739(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= 0.27628 )
		if( MFI_High <= -75.5936 )
			if( ema12 <= 0.045832 )
				if( Raw_Money_Flow <= 3.72697e+07 )
					if( Positive_Money_Flow <= 16999.1 )
						if( ema13 <= -0.377647 )
							if( ema3 <= 163.817 )
								if( Positive_Money_Flow_Sum <= 1.42751e+06 )
									ret := -0.933333 // sell
								if( Positive_Money_Flow_Sum > 1.42751e+06 )
									ret := 0.166667
							if( ema3 > 163.817 )
								if( ema2 <= 215.293 )
									ret := 0.381679
								if( ema2 > 215.293 )
									ret := -0.545455
						if( ema13 > -0.377647 )
							if( Negative_Money_Flow_Sum <= 6.2044e+06 )
								ret := -0.800000 // sell
							if( Negative_Money_Flow_Sum > 6.2044e+06 )
								if( ema2 <= 160.257 )
									ret := 0.977778 // buy
								if( ema2 > 160.257 )
									ret := 0.622881
					if( Positive_Money_Flow > 16999.1 )
						if( MFI_Low <= -18.2759 )
							if( MFI_High <= -79.5837 )
								ret := -0.285714
							if( MFI_High > -79.5837 )
								if( MFI <= 1.11353 )
									ret := 0.424242
								if( MFI > 1.11353 )
									ret := 0.766667 // buy
						if( MFI_Low > -18.2759 )
							if( Negative_Money_Flow_Sum <= 3.08469e+07 )
								if( Negative_Money_Flow_Sum <= 1.67347e+07 )
									ret := 0.277778
								if( Negative_Money_Flow_Sum > 1.67347e+07 )
									ret := -0.965517 // sell
							if( Negative_Money_Flow_Sum > 3.08469e+07 )
								if( ema13 <= -1.04505 )
									ret := 0.833333 // buy
								if( ema13 > -1.04505 )
									ret := 0.071429
				if( Raw_Money_Flow > 3.72697e+07 )
					if( Positive_Money_Flow_Sum <= 1.82393e+06 )
						if( Money_Flow_Ratio <= 0.008324 )
							ret := 0.500000
						if( Money_Flow_Ratio > 0.008324 )
							if( ema2 <= 184.067 )
								ret := 0.000000
							if( ema2 > 184.067 )
								if( MFI_Low <= -18.7338 )
									ret := -0.750000 // sell
								if( MFI_Low > -18.7338 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 1.82393e+06 )
						if( Negative_Money_Flow <= 6.15201e+07 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow > 6.15201e+07 )
							ret := 0.000000
			if( ema12 > 0.045832 )
				if( Positive_Money_Flow <= 178.368 )
					if( Positive_Money_Flow_Sum <= 947958 )
						if( Typical_Price <= 178.682 )
							if( tema <= 168.769 )
								if( MFI <= 1.21396 )
									ret := -0.400000
								if( MFI > 1.21396 )
									ret := 0.750000 // buy
							if( tema > 168.769 )
								ret := -1.000000 // sell
						if( Typical_Price > 178.682 )
							if( Raw_Money_Flow <= 78320.2 )
								ret := 0.000000
							if( Raw_Money_Flow > 78320.2 )
								if( Raw_Money_Flow <= 173928 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 173928 )
									ret := 0.250000
					if( Positive_Money_Flow_Sum > 947958 )
						if( Positive_Money_Flow_Sum <= 2.4738e+06 )
							if( tema <= 170.046 )
								if( tema <= 160.414 )
									ret := 0.500000
								if( tema > 160.414 )
									ret := 0.000000
							if( tema > 170.046 )
								if( Negative_Money_Flow_Sum <= 4.48577e+07 )
									ret := 0.444444
								if( Negative_Money_Flow_Sum > 4.48577e+07 )
									ret := 0.941176 // buy
						if( Positive_Money_Flow_Sum > 2.4738e+06 )
							if( MFI_High <= -76.5289 )
								ret := 0.400000
							if( MFI_High > -76.5289 )
								ret := -0.750000 // sell
				if( Positive_Money_Flow > 178.368 )
					if( Negative_Money_Flow_Sum <= 6.11735e+07 )
						if( MFI_Low <= -17.4521 )
							ret := 0.571429
						if( MFI_Low > -17.4521 )
							if( Positive_Money_Flow_Sum <= 395733 )
								ret := -0.500000
							if( Positive_Money_Flow_Sum > 395733 )
								if( ema2 <= 177.186 )
									ret := -0.400000
								if( ema2 > 177.186 )
									ret := 0.000000
					if( Negative_Money_Flow_Sum > 6.11735e+07 )
						if( tema <= 193.194 )
							if( Money_Flow_Ratio <= 0.005673 )
								if( ema12 <= 0.079623 )
									ret := 0.500000
								if( ema12 > 0.079623 )
									ret := -0.625000
							if( Money_Flow_Ratio > 0.005673 )
								if( ema12 <= 0.07365 )
									ret := -0.636364
								if( ema12 > 0.07365 )
									ret := -0.909091 // sell
						if( tema > 193.194 )
							if( MFI <= 0.656287 )
								ret := -0.250000
							if( MFI > 0.656287 )
								ret := 0.000000
		if( MFI_High > -75.5936 )
			if( MFI <= 84.3965 )
				if( ema2 <= 166.107 )
					if( ema13 <= -0.386447 )
						if( Negative_Money_Flow_Sum <= 757683 )
							if( ema2 <= 163.661 )
								if( Positive_Money_Flow_Sum <= 690817 )
									ret := 0.352941
								if( Positive_Money_Flow_Sum > 690817 )
									ret := -0.692308
							if( ema2 > 163.661 )
								if( Money_Flow_Ratio <= 1.28664 )
									ret := -0.735294 // sell
								if( Money_Flow_Ratio > 1.28664 )
									ret := 0.400000
						if( Negative_Money_Flow_Sum > 757683 )
							if( Negative_Money_Flow_Sum <= 1.01207e+08 )
								if( Positive_Money_Flow <= 6.52678e+06 )
									ret := 0.300358
								if( Positive_Money_Flow > 6.52678e+06 )
									ret := -0.166667
							if( Negative_Money_Flow_Sum > 1.01207e+08 )
								if( Raw_Money_Flow <= 2.13165e+07 )
									ret := -0.594595
								if( Raw_Money_Flow > 2.13165e+07 )
									ret := 0.875000 // buy
					if( ema13 > -0.386447 )
						if( Negative_Money_Flow_Sum <= 497052 )
							if( Money_Flow_Ratio <= 2.03651 )
								if( Negative_Money_Flow_Sum <= 416054 )
									ret := -0.118812
								if( Negative_Money_Flow_Sum > 416054 )
									ret := -0.487500
							if( Money_Flow_Ratio > 2.03651 )
								if( ema12 <= 0.095702 )
									ret := 0.485294
								if( ema12 > 0.095702 )
									ret := -0.145038
						if( Negative_Money_Flow_Sum > 497052 )
							if( Raw_Money_Flow <= 6.75949e+06 )
								if( MFI_Low <= 63.1981 )
									ret := 0.079066
								if( MFI_Low > 63.1981 )
									ret := -0.565217
							if( Raw_Money_Flow > 6.75949e+06 )
								if( Money_Flow_Ratio <= 3.02661 )
									ret := 0.317073
								if( Money_Flow_Ratio > 3.02661 )
									ret := -0.063830
				if( ema2 > 166.107 )
					if( Positive_Money_Flow_Sum <= 2.52633e+06 )
						if( ema12 <= 0.103112 )
							if( Negative_Money_Flow <= 611.963 )
								if( Positive_Money_Flow <= 117728 )
									ret := 0.000000
								if( Positive_Money_Flow > 117728 )
									ret := 0.144558
							if( Negative_Money_Flow > 611.963 )
								if( ema2 <= 208.573 )
									ret := 0.208974
								if( ema2 > 208.573 )
									ret := 0.051376
						if( ema12 > 0.103112 )
							if( Positive_Money_Flow_Sum <= 2.32146e+06 )
								if( Positive_Money_Flow_Sum <= 909319 )
									ret := 0.056128
								if( Positive_Money_Flow_Sum > 909319 )
									ret := -0.162883
							if( Positive_Money_Flow_Sum > 2.32146e+06 )
								if( tema <= 210.245 )
									ret := 0.615385
								if( tema > 210.245 )
									ret := -0.133333
					if( Positive_Money_Flow_Sum > 2.52633e+06 )
						if( Negative_Money_Flow_Sum <= 3.99388e+07 )
							if( Positive_Money_Flow_Sum <= 6.13061e+07 )
								if( ema12 <= -0.875444 )
									ret := -0.727273 // sell
								if( ema12 > -0.875444 )
									ret := 0.030578
							if( Positive_Money_Flow_Sum > 6.13061e+07 )
								if( ema13 <= 0.475087 )
									ret := 0.162698
								if( ema13 > 0.475087 )
									ret := 0.672269
						if( Negative_Money_Flow_Sum > 3.99388e+07 )
							if( Negative_Money_Flow_Sum <= 7.3601e+07 )
								if( ema13 <= -0.546242 )
									ret := -0.241071
								if( ema13 > -0.546242 )
									ret := -0.046619
							if( Negative_Money_Flow_Sum > 7.3601e+07 )
								if( Negative_Money_Flow <= 692.833 )
									ret := -0.042373
								if( Negative_Money_Flow > 692.833 )
									ret := 0.139034
			if( MFI > 84.3965 )
				if( Negative_Money_Flow <= 2949.24 )
					if( Positive_Money_Flow_Sum <= 3.29974e+08 )
						if( Positive_Money_Flow_Sum <= 3.53349e+06 )
							if( Negative_Money_Flow_Sum <= 165544 )
								if( ema12 <= 0.206717 )
									ret := 0.346154
								if( ema12 > 0.206717 )
									ret := -0.470588
							if( Negative_Money_Flow_Sum > 165544 )
								if( Raw_Money_Flow <= 18050.4 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 18050.4 )
									ret := -0.435644
						if( Positive_Money_Flow_Sum > 3.53349e+06 )
							if( Raw_Money_Flow <= 2.28865e+07 )
								if( Positive_Money_Flow <= 6.96563e+06 )
									ret := 0.140639
								if( Positive_Money_Flow > 6.96563e+06 )
									ret := 0.435484
							if( Raw_Money_Flow > 2.28865e+07 )
								if( Positive_Money_Flow_Sum <= 9.20534e+07 )
									ret := -0.462500
								if( Positive_Money_Flow_Sum > 9.20534e+07 )
									ret := 0.319149
					if( Positive_Money_Flow_Sum > 3.29974e+08 )
						if( ema3 <= 164.142 )
							if( ema12 <= -0.129218 )
								ret := 0.000000
							if( ema12 > -0.129218 )
								if( Money_Flow_Ratio <= 120.687 )
									ret := -0.971429 // sell
								if( Money_Flow_Ratio > 120.687 )
									ret := -0.500000
						if( ema3 > 164.142 )
							if( Money_Flow_Ratio <= 10.1467 )
								if( ema3 <= 168.963 )
									ret := -0.500000
								if( ema3 > 168.963 )
									ret := 0.536585
							if( Money_Flow_Ratio > 10.1467 )
								if( MFI_High <= 14.7719 )
									ret := -0.531250
								if( MFI_High > 14.7719 )
									ret := -0.106383
				if( Negative_Money_Flow > 2949.24 )
					if( ema3 <= 157.073 )
						if( Negative_Money_Flow <= 682333 )
							if( ema1 <= 149.861 )
								ret := -0.500000
							if( ema1 > 149.861 )
								if( MFI <= 98.5172 )
									ret := -1.000000 // sell
								if( MFI > 98.5172 )
									ret := -0.750000 // sell
						if( Negative_Money_Flow > 682333 )
							ret := 0.750000 // buy
					if( ema3 > 157.073 )
						if( Positive_Money_Flow_Sum <= 2.73384e+06 )
							if( MFI_Low <= 65.987 )
								if( Negative_Money_Flow <= 50733.1 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 50733.1 )
									ret := -0.285714
							if( MFI_Low > 65.987 )
								if( Negative_Money_Flow_Sum <= 165624 )
									ret := -0.625000
								if( Negative_Money_Flow_Sum > 165624 )
									ret := 0.300000
						if( Positive_Money_Flow_Sum > 2.73384e+06 )
							if( ema13 <= 0.230131 )
								if( tema <= 218.249 )
									ret := 0.486014
								if( tema > 218.249 )
									ret := -0.750000 // sell
							if( ema13 > 0.230131 )
								if( Positive_Money_Flow_Sum <= 2.62185e+08 )
									ret := 0.070423
								if( Positive_Money_Flow_Sum > 2.62185e+08 )
									ret := 0.600000
	if( ema12 > 0.27628 )
		if( Negative_Money_Flow_Sum <= 1.50126e+07 )
			if( Positive_Money_Flow <= 152615 )
				if( Typical_Price <= 186.259 )
					if( Positive_Money_Flow_Sum <= 855704 )
						if( Money_Flow_Ratio <= 3.64343 )
							if( ema1 <= 177.455 )
								if( Positive_Money_Flow_Sum <= 490769 )
									ret := -0.224138
								if( Positive_Money_Flow_Sum > 490769 )
									ret := 0.431138
							if( ema1 > 177.455 )
								if( Money_Flow_Ratio <= 1.72488 )
									ret := 0.909091 // buy
								if( Money_Flow_Ratio > 1.72488 )
									ret := 0.521739
						if( Money_Flow_Ratio > 3.64343 )
							if( Positive_Money_Flow_Sum <= 821038 )
								if( Negative_Money_Flow_Sum <= 102592 )
									ret := -0.666667
								if( Negative_Money_Flow_Sum > 102592 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 821038 )
								ret := 0.750000 // buy
					if( Positive_Money_Flow_Sum > 855704 )
						if( MFI_High <= -15.7607 )
							if( Negative_Money_Flow_Sum <= 1.26073e+06 )
								if( Typical_Price <= 162.79 )
									ret := -0.562500
								if( Typical_Price > 162.79 )
									ret := -0.906977 // sell
							if( Negative_Money_Flow_Sum > 1.26073e+06 )
								if( Positive_Money_Flow_Sum <= 1.39815e+07 )
									ret := 0.106061
								if( Positive_Money_Flow_Sum > 1.39815e+07 )
									ret := -0.555556
						if( MFI_High > -15.7607 )
							if( Positive_Money_Flow_Sum <= 1.14656e+06 )
								if( ema13 <= 0.589992 )
									ret := -0.944444 // sell
								if( ema13 > 0.589992 )
									ret := -0.526316
							if( Positive_Money_Flow_Sum > 1.14656e+06 )
								if( ema13 <= 0.944613 )
									ret := 0.134796
								if( ema13 > 0.944613 )
									ret := 0.732143 // buy
				if( Typical_Price > 186.259 )
					if( Positive_Money_Flow_Sum <= 1.04545e+06 )
						if( MFI_High <= -4.37587 )
							if( Negative_Money_Flow_Sum <= 817761 )
								if( ema3 <= 205.107 )
									ret := -0.297872
								if( ema3 > 205.107 )
									ret := -0.809524 // sell
							if( Negative_Money_Flow_Sum > 817761 )
								if( Negative_Money_Flow <= 106711 )
									ret := -0.137931
								if( Negative_Money_Flow > 106711 )
									ret := 0.900000 // buy
						if( MFI_High > -4.37587 )
							if( ema13 <= 0.634861 )
								ret := 1.000000 // buy
							if( ema13 > 0.634861 )
								ret := 0.000000
					if( Positive_Money_Flow_Sum > 1.04545e+06 )
						if( Negative_Money_Flow_Sum <= 9.23392e+06 )
							if( ema2 <= 213.947 )
								if( Positive_Money_Flow_Sum <= 1.46857e+06 )
									ret := -0.786517 // sell
								if( Positive_Money_Flow_Sum > 1.46857e+06 )
									ret := -0.389163
							if( ema2 > 213.947 )
								if( ema3 <= 227.998 )
									ret := 0.132075
								if( ema3 > 227.998 )
									ret := -0.600000
						if( Negative_Money_Flow_Sum > 9.23392e+06 )
							if( ema13 <= 0.934721 )
								if( Positive_Money_Flow_Sum <= 5.49562e+07 )
									ret := 0.200000
								if( Positive_Money_Flow_Sum > 5.49562e+07 )
									ret := 0.692308
							if( ema13 > 0.934721 )
								ret := -1.000000 // sell
			if( Positive_Money_Flow > 152615 )
				if( Positive_Money_Flow_Sum <= 2.46108e+07 )
					if( Typical_Price <= 183.617 )
						if( Positive_Money_Flow_Sum <= 890617 )
							if( ema3 <= 170.245 )
								ret := -0.428571
							if( ema3 > 170.245 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 890617 )
							if( MFI_Low <= 28.1104 )
								if( tema <= 168.858 )
									ret := 0.842105 // buy
								if( tema > 168.858 )
									ret := -0.750000 // sell
							if( MFI_Low > 28.1104 )
								if( tema <= 160.337 )
									ret := -0.780488 // sell
								if( tema > 160.337 )
									ret := -0.288732
					if( Typical_Price > 183.617 )
						if( Money_Flow_Ratio <= 3.04989 )
							if( MFI <= 35.4022 )
								ret := 0.000000
							if( MFI > 35.4022 )
								if( ema3 <= 192.882 )
									ret := -0.574468
								if( ema3 > 192.882 )
									ret := -0.798246 // sell
						if( Money_Flow_Ratio > 3.04989 )
							if( MFI <= 77.5012 )
								if( Negative_Money_Flow_Sum <= 1.92503e+06 )
									ret := 0.520000
								if( Negative_Money_Flow_Sum > 1.92503e+06 )
									ret := -0.833333 // sell
							if( MFI > 77.5012 )
								if( Negative_Money_Flow_Sum <= 336176 )
									ret := -0.923077 // sell
								if( Negative_Money_Flow_Sum > 336176 )
									ret := -0.396552
				if( Positive_Money_Flow_Sum > 2.46108e+07 )
					if( ema1 <= 199.465 )
						if( Raw_Money_Flow <= 1.20776e+06 )
							if( Raw_Money_Flow <= 1.01913e+06 )
								ret := 0.142857
							if( Raw_Money_Flow > 1.01913e+06 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 1.20776e+06 )
							if( ema13 <= 0.766514 )
								if( Money_Flow_Ratio <= 10.5752 )
									ret := -0.111111
								if( Money_Flow_Ratio > 10.5752 )
									ret := -0.618421
							if( ema13 > 0.766514 )
								if( Money_Flow_Ratio <= 61.2226 )
									ret := -0.646259
								if( Money_Flow_Ratio > 61.2226 )
									ret := 0.888889 // buy
					if( ema1 > 199.465 )
						if( ema12 <= 0.403873 )
							if( MFI_Low <= 61.069 )
								if( tema <= 207.936 )
									ret := -0.428571
								if( tema > 207.936 )
									ret := 0.562500
							if( MFI_Low > 61.069 )
								if( MFI_Low <= 66.6932 )
									ret := 0.877551 // buy
								if( MFI_Low > 66.6932 )
									ret := 0.347826
						if( ema12 > 0.403873 )
							if( Positive_Money_Flow <= 1.25379e+07 )
								if( Positive_Money_Flow <= 4.94075e+06 )
									ret := 0.222222
								if( Positive_Money_Flow > 4.94075e+06 )
									ret := -0.695652
							if( Positive_Money_Flow > 1.25379e+07 )
								if( MFI_High <= 15.6816 )
									ret := 0.250000
								if( MFI_High > 15.6816 )
									ret := 1.000000 // buy
		if( Negative_Money_Flow_Sum > 1.50126e+07 )
			if( MFI_High <= -4.97642 )
				if( ema12 <= 0.608193 )
					if( ema2 <= 193.248 )
						if( ema13 <= 0.50603 )
							if( Typical_Price <= 167.888 )
								if( Raw_Money_Flow <= 2.90649e+06 )
									ret := 0.750000 // buy
								if( Raw_Money_Flow > 2.90649e+06 )
									ret := -0.648649
							if( Typical_Price > 167.888 )
								if( Raw_Money_Flow <= 3.64993e+06 )
									ret := -0.346154
								if( Raw_Money_Flow > 3.64993e+06 )
									ret := 0.250000
						if( ema13 > 0.50603 )
							if( ema12 <= 0.432225 )
								if( MFI_High <= -15.1178 )
									ret := 0.118557
								if( MFI_High > -15.1178 )
									ret := 0.398876
							if( ema12 > 0.432225 )
								if( Negative_Money_Flow_Sum <= 1.63642e+07 )
									ret := 0.692308
								if( Negative_Money_Flow_Sum > 1.63642e+07 )
									ret := -0.208696
					if( ema2 > 193.248 )
						if( MFI_Low <= 25.2331 )
							if( Negative_Money_Flow_Sum <= 3.99732e+07 )
								if( Negative_Money_Flow <= 5.51849e+06 )
									ret := -0.333333
								if( Negative_Money_Flow > 5.51849e+06 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 3.99732e+07 )
								if( Negative_Money_Flow_Sum <= 1.46205e+08 )
									ret := -0.800000 // sell
								if( Negative_Money_Flow_Sum > 1.46205e+08 )
									ret := 0.142857
						if( MFI_Low > 25.2331 )
							if( MFI_High <= -29.1108 )
								if( Typical_Price <= 197.643 )
									ret := 1.000000 // buy
								if( Typical_Price > 197.643 )
									ret := 0.500000
							if( MFI_High > -29.1108 )
								if( Positive_Money_Flow_Sum <= 9.11289e+07 )
									ret := -0.011976
								if( Positive_Money_Flow_Sum > 9.11289e+07 )
									ret := -0.586957
				if( ema12 > 0.608193 )
					if( ema2 <= 182.191 )
						if( Money_Flow_Ratio <= 0.800554 )
							if( Raw_Money_Flow <= 7.85054e+06 )
								if( Typical_Price <= 164.486 )
									ret := -0.250000
								if( Typical_Price > 164.486 )
									ret := -1.000000 // sell
							if( Raw_Money_Flow > 7.85054e+06 )
								ret := 0.500000
						if( Money_Flow_Ratio > 0.800554 )
							if( Negative_Money_Flow_Sum <= 2.18926e+08 )
								if( ema12 <= 0.619347 )
									ret := -0.500000
								if( ema12 > 0.619347 )
									ret := -0.962963 // sell
							if( Negative_Money_Flow_Sum > 2.18926e+08 )
								ret := 0.200000
					if( ema2 > 182.191 )
						if( ema1 <= 190.142 )
							ret := 1.000000 // buy
						if( ema1 > 190.142 )
							if( Positive_Money_Flow_Sum <= 2.98312e+07 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 2.98312e+07 )
								if( Positive_Money_Flow_Sum <= 7.44349e+07 )
									ret := 0.250000
								if( Positive_Money_Flow_Sum > 7.44349e+07 )
									ret := -0.333333
			if( MFI_High > -4.97642 )
				if( MFI_High <= 13.3854 )
					if( ema13 <= 1.28684 )
						if( Raw_Money_Flow <= 497862 )
							if( ema12 <= 0.306054 )
								ret := -0.750000 // sell
							if( ema12 > 0.306054 )
								ret := -1.000000 // sell
						if( Raw_Money_Flow > 497862 )
							if( Positive_Money_Flow_Sum <= 1.02279e+08 )
								if( Positive_Money_Flow_Sum <= 8.58158e+07 )
									ret := 0.307692
								if( Positive_Money_Flow_Sum > 8.58158e+07 )
									ret := -0.491228
							if( Positive_Money_Flow_Sum > 1.02279e+08 )
								if( Positive_Money_Flow_Sum <= 1.1712e+08 )
									ret := 0.796296 // buy
								if( Positive_Money_Flow_Sum > 1.1712e+08 )
									ret := 0.239437
					if( ema13 > 1.28684 )
						if( tema <= 205.246 )
							if( MFI <= 82.7854 )
								if( ema12 <= 1.0557 )
									ret := 0.625000
								if( ema12 > 1.0557 )
									ret := -1.000000 // sell
							if( MFI > 82.7854 )
								if( Money_Flow_Ratio <= 9.9905 )
									ret := 0.910714 // buy
								if( Money_Flow_Ratio > 9.9905 )
									ret := 0.600000
						if( tema > 205.246 )
							ret := -0.500000
				if( MFI_High > 13.3854 )
					if( Negative_Money_Flow_Sum <= 6.16973e+07 )
						if( Typical_Price <= 224.755 )
							ret := -1.000000 // sell
						if( Typical_Price > 224.755 )
							ret := 0.400000
					if( Negative_Money_Flow_Sum > 6.16973e+07 )
						ret := 0.600000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_QCOM_1Min_0fc1f739(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, ema2, ema1, ema12, ema3, ema13, tema)

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


