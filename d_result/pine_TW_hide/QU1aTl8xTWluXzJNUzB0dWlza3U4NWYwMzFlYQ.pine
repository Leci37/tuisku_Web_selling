//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: AMZN_1Min_2MS0_85f031ea Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_1Min_2MS0_85f031ea", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_1Min_85f031ea(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( k <= 52.1315 )
		if( rsi1 <= 52.4292 )
			if( MFI_Low <= -8.10676 )
				if( rsi1 <= 24.7962 )
					if( MFI_High <= -74.6956 )
						if( MFI <= 2.17254 )
							if( d_k <= -0.006955 )
								if( Typical_Price <= 182.869 )
									ret := -0.333333
								if( Typical_Price > 182.869 )
									ret := 0.260870
							if( d_k > -0.006955 )
								if( Money_Flow_Ratio <= 0.010206 )
									ret := 0.100000
								if( Money_Flow_Ratio > 0.010206 )
									ret := 0.766234 // buy
						if( MFI > 2.17254 )
							if( Positive_Money_Flow_Sum <= 2.14881e+07 )
								if( d <= 18.2972 )
									ret := -0.182432
								if( d > 18.2972 )
									ret := -0.692308
							if( Positive_Money_Flow_Sum > 2.14881e+07 )
								if( Money_Flow_Ratio <= 0.043213 )
									ret := 0.900000 // buy
								if( Money_Flow_Ratio > 0.043213 )
									ret := 0.555556
					if( MFI_High > -74.6956 )
						if( smoothK_k <= 0.745745 )
							if( Negative_Money_Flow <= 1.64579e+07 )
								if( Negative_Money_Flow <= 1.51028e+07 )
									ret := 0.080586
								if( Negative_Money_Flow > 1.51028e+07 )
									ret := -0.785714 // sell
							if( Negative_Money_Flow > 1.64579e+07 )
								if( rsi1 <= 14.6691 )
									ret := 0.673913
								if( rsi1 > 14.6691 )
									ret := 0.050000
						if( smoothK_k > 0.745745 )
							if( Typical_Price <= 177.595 )
								if( Raw_Money_Flow <= 1.80464e+07 )
									ret := 0.825806 // buy
								if( Raw_Money_Flow > 1.80464e+07 )
									ret := 0.555556
							if( Typical_Price > 177.595 )
								if( Positive_Money_Flow <= 1.91058e+07 )
									ret := 0.337408
								if( Positive_Money_Flow > 1.91058e+07 )
									ret := -0.461538
				if( rsi1 > 24.7962 )
					if( Positive_Money_Flow_Sum <= 4.50868e+06 )
						if( Negative_Money_Flow <= 392535 )
							if( Negative_Money_Flow_Sum <= 1.87596e+06 )
								ret := -0.666667
							if( Negative_Money_Flow_Sum > 1.87596e+06 )
								if( MFI_Low <= -8.19788 )
									ret := 0.060665
								if( MFI_Low > -8.19788 )
									ret := 0.750000 // buy
						if( Negative_Money_Flow > 392535 )
							if( Raw_Money_Flow <= 6.79578e+07 )
								if( Positive_Money_Flow_Sum <= 1.13844e+06 )
									ret := 0.208791
								if( Positive_Money_Flow_Sum > 1.13844e+06 )
									ret := 0.709497 // buy
							if( Raw_Money_Flow > 6.79578e+07 )
								if( MFI_High <= -78.0846 )
									ret := -0.230769
								if( MFI_High > -78.0846 )
									ret := 0.153846
					if( Positive_Money_Flow_Sum > 4.50868e+06 )
						if( MFI_Low <= -13.119 )
							if( Raw_Money_Flow <= 2.84834e+06 )
								if( k <= 5.89058 )
									ret := 0.000000
								if( k > 5.89058 )
									ret := -0.745614 // sell
							if( Raw_Money_Flow > 2.84834e+06 )
								if( MFI <= 3.67076 )
									ret := 0.520833
								if( MFI > 3.67076 )
									ret := -0.402299
						if( MFI_Low > -13.119 )
							if( d <= 17.2076 )
								if( smoothD_d <= 13.2673 )
									ret := -0.006211
								if( smoothD_d > 13.2673 )
									ret := -1.000000 // sell
							if( d > 17.2076 )
								if( Typical_Price <= 191.08 )
									ret := 0.373737
								if( Typical_Price > 191.08 )
									ret := -0.300000
			if( MFI_Low > -8.10676 )
				if( Typical_Price <= 183.955 )
					if( d_k <= -11.6386 )
						if( Money_Flow_Ratio <= 0.54704 )
							if( Positive_Money_Flow <= 6.28181e+06 )
								if( Negative_Money_Flow_Sum <= 1.50623e+08 )
									ret := 0.034146
								if( Negative_Money_Flow_Sum > 1.50623e+08 )
									ret := -0.508197
							if( Positive_Money_Flow > 6.28181e+06 )
								if( smoothK_k <= 46.8168 )
									ret := -0.463668
								if( smoothK_k > 46.8168 )
									ret := 0.533333
						if( Money_Flow_Ratio > 0.54704 )
							if( d <= 17.9497 )
								if( MFI <= 39.7347 )
									ret := 0.829787 // buy
								if( MFI > 39.7347 )
									ret := 0.000000
							if( d > 17.9497 )
								if( smoothK_k <= 46.8764 )
									ret := -0.129412
								if( smoothK_k > 46.8764 )
									ret := 0.274336
					if( d_k > -11.6386 )
						if( MFI_Low <= 20.0235 )
							if( Typical_Price <= 159.178 )
								if( smoothK_k <= 7.38853 )
									ret := -0.045455
								if( smoothK_k > 7.38853 )
									ret := -0.939394 // sell
							if( Typical_Price > 159.178 )
								if( Raw_Money_Flow <= 570959 )
									ret := 0.108795
								if( Raw_Money_Flow > 570959 )
									ret := 0.005651
						if( MFI_Low > 20.0235 )
							if( Negative_Money_Flow_Sum <= 736775 )
								if( Positive_Money_Flow_Sum <= 1.67948e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.67948e+06 )
									ret := -0.430233
							if( Negative_Money_Flow_Sum > 736775 )
								if( Money_Flow_Ratio <= 1.54412 )
									ret := 0.107949
								if( Money_Flow_Ratio > 1.54412 )
									ret := 0.231791
				if( Typical_Price > 183.955 )
					if( d <= 0.578393 )
						if( Positive_Money_Flow <= 7.28185e+06 )
							if( Raw_Money_Flow <= 2.11668e+07 )
								if( rsi1 <= 13.2704 )
									ret := 0.159091
								if( rsi1 > 13.2704 )
									ret := -0.266862
							if( Raw_Money_Flow > 2.11668e+07 )
								if( Negative_Money_Flow <= 4.43568e+07 )
									ret := -0.876712 // sell
								if( Negative_Money_Flow > 4.43568e+07 )
									ret := 0.000000
						if( Positive_Money_Flow > 7.28185e+06 )
							if( MFI_High <= -52.4096 )
								ret := 0.722222 // buy
							if( MFI_High > -52.4096 )
								if( d <= 0.13872 )
									ret := 0.066667
								if( d > 0.13872 )
									ret := -0.307692
					if( d > 0.578393 )
						if( Positive_Money_Flow_Sum <= 1.02092e+07 )
							if( Positive_Money_Flow_Sum <= 4.60392e+06 )
								if( d <= 42.5169 )
									ret := 0.004637
								if( d > 42.5169 )
									ret := 0.145957
							if( Positive_Money_Flow_Sum > 4.60392e+06 )
								if( rsi1 <= 31.6538 )
									ret := 0.532051
								if( rsi1 > 31.6538 )
									ret := 0.179868
						if( Positive_Money_Flow_Sum > 1.02092e+07 )
							if( Money_Flow_Ratio <= 0.159554 )
								if( k <= 8.91197 )
									ret := -0.625000
								if( k > 8.91197 )
									ret := -0.083969
							if( Money_Flow_Ratio > 0.159554 )
								if( Negative_Money_Flow_Sum <= 1.03176e+09 )
									ret := -0.011991
								if( Negative_Money_Flow_Sum > 1.03176e+09 )
									ret := 0.855072 // buy
		if( rsi1 > 52.4292 )
			if( MFI_Low <= 40.4722 )
				if( Positive_Money_Flow <= 6.52643e+07 )
					if( MFI_Low <= 13.7837 )
						if( smoothK_k <= 26.7737 )
							if( Money_Flow_Ratio <= 0.373746 )
								if( Raw_Money_Flow <= 2.03007e+07 )
									ret := 0.083700
								if( Raw_Money_Flow > 2.03007e+07 )
									ret := -0.368421
							if( Money_Flow_Ratio > 0.373746 )
								if( rsi1 <= 59.1638 )
									ret := 0.178218
								if( rsi1 > 59.1638 )
									ret := 0.613333
						if( smoothK_k > 26.7737 )
							if( rsi1 <= 53.2427 )
								if( Typical_Price <= 177.119 )
									ret := 0.807692 // buy
								if( Typical_Price > 177.119 )
									ret := -0.063830
							if( rsi1 > 53.2427 )
								if( smoothD_d <= 54.3647 )
									ret := -0.270492
								if( smoothD_d > 54.3647 )
									ret := 0.277108
					if( MFI_Low > 13.7837 )
						if( Typical_Price <= 175.702 )
							if( Negative_Money_Flow_Sum <= 3.32795e+08 )
								if( rsi1 <= 65.8583 )
									ret := -0.265678
								if( rsi1 > 65.8583 )
									ret := 0.081967
							if( Negative_Money_Flow_Sum > 3.32795e+08 )
								ret := 0.866667 // buy
						if( Typical_Price > 175.702 )
							if( Negative_Money_Flow_Sum <= 1.72942e+08 )
								if( Positive_Money_Flow <= 2.38683e+07 )
									ret := -0.067504
								if( Positive_Money_Flow > 2.38683e+07 )
									ret := 0.444444
							if( Negative_Money_Flow_Sum > 1.72942e+08 )
								if( MFI <= 50.5293 )
									ret := -0.138554
								if( MFI > 50.5293 )
									ret := -0.507614
				if( Positive_Money_Flow > 6.52643e+07 )
					if( Positive_Money_Flow <= 8.59724e+07 )
						ret := 1.000000 // buy
					if( Positive_Money_Flow > 8.59724e+07 )
						ret := 0.166667
			if( MFI_Low > 40.4722 )
				if( MFI_High <= 7.1123 )
					if( Positive_Money_Flow_Sum <= 1.23279e+08 )
						if( Typical_Price <= 176.963 )
							if( Typical_Price <= 173.161 )
								if( k <= 22.3122 )
									ret := 0.219780
								if( k > 22.3122 )
									ret := -0.225064
							if( Typical_Price > 173.161 )
								if( Negative_Money_Flow <= 4367.43 )
									ret := 0.219814
								if( Negative_Money_Flow > 4367.43 )
									ret := 0.459596
						if( Typical_Price > 176.963 )
							if( Negative_Money_Flow_Sum <= 386933 )
								if( d_k <= 6.60915 )
									ret := 0.012821
								if( d_k > 6.60915 )
									ret := 0.555556
							if( Negative_Money_Flow_Sum > 386933 )
								if( Raw_Money_Flow <= 40686.2 )
									ret := 0.329670
								if( Raw_Money_Flow > 40686.2 )
									ret := -0.078125
					if( Positive_Money_Flow_Sum > 1.23279e+08 )
						if( MFI_Low <= 42.26 )
							if( Positive_Money_Flow_Sum <= 1.77999e+08 )
								if( Positive_Money_Flow_Sum <= 1.7363e+08 )
									ret := 0.403509
								if( Positive_Money_Flow_Sum > 1.7363e+08 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 1.77999e+08 )
								if( Positive_Money_Flow <= 1.88232e+07 )
									ret := 0.792683 // buy
								if( Positive_Money_Flow > 1.88232e+07 )
									ret := 0.462963
						if( MFI_Low > 42.26 )
							if( Positive_Money_Flow_Sum <= 1.40914e+08 )
								if( Money_Flow_Ratio <= 1.80913 )
									ret := -0.115385
								if( Money_Flow_Ratio > 1.80913 )
									ret := 0.457045
							if( Positive_Money_Flow_Sum > 1.40914e+08 )
								if( Positive_Money_Flow_Sum <= 5.41575e+08 )
									ret := 0.033694
								if( Positive_Money_Flow_Sum > 5.41575e+08 )
									ret := 0.389610
				if( MFI_High > 7.1123 )
					if( MFI_Low <= 76.4496 )
						if( rsi1 <= 66.4657 )
							if( Negative_Money_Flow_Sum <= 494098 )
								if( smoothK_k <= 31.4286 )
									ret := 0.250000
								if( smoothK_k > 31.4286 )
									ret := 0.692308
							if( Negative_Money_Flow_Sum > 494098 )
								if( Positive_Money_Flow <= 1.17373e+08 )
									ret := -0.320175
								if( Positive_Money_Flow > 1.17373e+08 )
									ret := 0.214286
						if( rsi1 > 66.4657 )
							if( Positive_Money_Flow_Sum <= 2.39543e+06 )
								ret := 0.230769
							if( Positive_Money_Flow_Sum > 2.39543e+06 )
								if( Positive_Money_Flow <= 1.4663e+07 )
									ret := -0.603960
								if( Positive_Money_Flow > 1.4663e+07 )
									ret := -0.962963 // sell
					if( MFI_Low > 76.4496 )
						if( Positive_Money_Flow <= 3.87616e+07 )
							if( Money_Flow_Ratio <= 64.8527 )
								if( d_k <= -1.8041 )
									ret := 0.650000
								if( d_k > -1.8041 )
									ret := 0.171429
							if( Money_Flow_Ratio > 64.8527 )
								if( smoothD_d <= 26.693 )
									ret := 0.000000
								if( smoothD_d > 26.693 )
									ret := -0.210526
						if( Positive_Money_Flow > 3.87616e+07 )
							ret := -0.500000
	if( k > 52.1315 )
		if( Positive_Money_Flow_Sum <= 2.35546e+06 )
			if( d_k <= 6.32935 )
				if( d <= 53.1405 )
					if( k <= 74.2559 )
						if( Raw_Money_Flow <= 613249 )
							if( Negative_Money_Flow <= 366896 )
								if( rsi1 <= 34.7131 )
									ret := -0.622642
								if( rsi1 > 34.7131 )
									ret := -0.140559
							if( Negative_Money_Flow > 366896 )
								if( rsi1 <= 42.2896 )
									ret := 0.633333
								if( rsi1 > 42.2896 )
									ret := 0.139535
						if( Raw_Money_Flow > 613249 )
							if( d_k <= -7.82854 )
								if( Negative_Money_Flow <= 1.06162e+06 )
									ret := 0.307692
								if( Negative_Money_Flow > 1.06162e+06 )
									ret := -0.250000
							if( d_k > -7.82854 )
								ret := 0.857143 // buy
					if( k > 74.2559 )
						if( MFI_Low <= 35.8996 )
							if( MFI_Low <= 11.3992 )
								ret := 0.666667
							if( MFI_Low > 11.3992 )
								if( Money_Flow_Ratio <= 0.762206 )
									ret := -0.062500
								if( Money_Flow_Ratio > 0.762206 )
									ret := 0.200000
						if( MFI_Low > 35.8996 )
							if( Typical_Price <= 176.517 )
								ret := 0.300000
							if( Typical_Price > 176.517 )
								ret := 0.823529 // buy
				if( d > 53.1405 )
					if( rsi1 <= 60.8995 )
						if( MFI_Low <= 39.4904 )
							if( Negative_Money_Flow_Sum <= 1.24426e+06 )
								if( Raw_Money_Flow <= 50772.6 )
									ret := -0.238562
								if( Raw_Money_Flow > 50772.6 )
									ret := 0.025339
							if( Negative_Money_Flow_Sum > 1.24426e+06 )
								if( Money_Flow_Ratio <= 0.884358 )
									ret := 0.056703
								if( Money_Flow_Ratio > 0.884358 )
									ret := 0.226580
						if( MFI_Low > 39.4904 )
							if( Typical_Price <= 176.656 )
								if( d_k <= -16.6018 )
									ret := -0.619048
								if( d_k > -16.6018 )
									ret := 0.576037
							if( Typical_Price > 176.656 )
								if( k <= 77.736 )
									ret := 0.248744
								if( k > 77.736 )
									ret := 0.000000
					if( rsi1 > 60.8995 )
						if( MFI <= 85.6625 )
							if( Typical_Price <= 161.497 )
								if( Money_Flow_Ratio <= 0.986162 )
									ret := 0.684211
								if( Money_Flow_Ratio > 0.986162 )
									ret := 0.500000
							if( Typical_Price > 161.497 )
								if( d_k <= -4.78082 )
									ret := 0.035105
								if( d_k > -4.78082 )
									ret := -0.166076
						if( MFI > 85.6625 )
							if( Positive_Money_Flow_Sum <= 2.23014e+06 )
								if( MFI_Low <= 67.4457 )
									ret := -0.225806
								if( MFI_Low > 67.4457 )
									ret := 0.167939
							if( Positive_Money_Flow_Sum > 2.23014e+06 )
								if( smoothD_d <= 90.9953 )
									ret := 0.955556 // buy
								if( smoothD_d > 90.9953 )
									ret := 0.384615
			if( d_k > 6.32935 )
				if( Raw_Money_Flow <= 60651.6 )
					if( MFI_Low <= 46.1075 )
						if( Negative_Money_Flow <= 47844.7 )
							if( rsi1 <= 54.3168 )
								if( smoothD_d <= 81.7228 )
									ret := 0.149533
								if( smoothD_d > 81.7228 )
									ret := -0.193548
							if( rsi1 > 54.3168 )
								if( Raw_Money_Flow <= 40114.1 )
									ret := 0.190476
								if( Raw_Money_Flow > 40114.1 )
									ret := 0.680851
						if( Negative_Money_Flow > 47844.7 )
							if( MFI_Low <= 38.5424 )
								if( rsi1 <= 43.1912 )
									ret := 0.000000
								if( rsi1 > 43.1912 )
									ret := -0.527778
							if( MFI_Low > 38.5424 )
								ret := 0.142857
					if( MFI_Low > 46.1075 )
						if( Typical_Price <= 177.415 )
							if( Negative_Money_Flow_Sum <= 626428 )
								ret := -0.363636
							if( Negative_Money_Flow_Sum > 626428 )
								ret := -1.000000 // sell
						if( Typical_Price > 177.415 )
							if( Negative_Money_Flow <= 38526.6 )
								if( Positive_Money_Flow <= 22700.7 )
									ret := 0.294118
								if( Positive_Money_Flow > 22700.7 )
									ret := 0.000000
							if( Negative_Money_Flow > 38526.6 )
								if( Typical_Price <= 184.61 )
									ret := -0.705882 // sell
								if( Typical_Price > 184.61 )
									ret := -0.230769
				if( Raw_Money_Flow > 60651.6 )
					if( Negative_Money_Flow_Sum <= 1.76565e+06 )
						if( rsi1 <= 36.2844 )
							if( Money_Flow_Ratio <= 0.838957 )
								if( Typical_Price <= 179.19 )
									ret := 1.000000 // buy
								if( Typical_Price > 179.19 )
									ret := 0.800000 // buy
							if( Money_Flow_Ratio > 0.838957 )
								ret := 0.500000
						if( rsi1 > 36.2844 )
							if( Raw_Money_Flow <= 465211 )
								if( Money_Flow_Ratio <= 0.534448 )
									ret := -0.080645
								if( Money_Flow_Ratio > 0.534448 )
									ret := 0.266234
							if( Raw_Money_Flow > 465211 )
								if( Negative_Money_Flow <= 712746 )
									ret := -0.563636
								if( Negative_Money_Flow > 712746 )
									ret := 0.416667
					if( Negative_Money_Flow_Sum > 1.76565e+06 )
						if( Positive_Money_Flow_Sum <= 1.46703e+06 )
							if( Negative_Money_Flow_Sum <= 1.95382e+06 )
								if( MFI_Low <= 13.0855 )
									ret := -0.388889
								if( MFI_Low > 13.0855 )
									ret := 0.000000
							if( Negative_Money_Flow_Sum > 1.95382e+06 )
								if( d_k <= 19.1695 )
									ret := 0.225434
								if( d_k > 19.1695 )
									ret := 0.928571 // buy
						if( Positive_Money_Flow_Sum > 1.46703e+06 )
							if( Positive_Money_Flow_Sum <= 1.8589e+06 )
								if( rsi1 <= 46.733 )
									ret := 0.000000
								if( rsi1 > 46.733 )
									ret := -0.600000
							if( Positive_Money_Flow_Sum > 1.8589e+06 )
								if( rsi1 <= 66.7272 )
									ret := 0.134328
								if( rsi1 > 66.7272 )
									ret := -0.800000 // sell
		if( Positive_Money_Flow_Sum > 2.35546e+06 )
			if( Typical_Price <= 186.865 )
				if( Positive_Money_Flow_Sum <= 2.81198e+07 )
					if( Typical_Price <= 181.59 )
						if( Money_Flow_Ratio <= 0.063595 )
							if( Negative_Money_Flow_Sum <= 1.27798e+08 )
								if( Positive_Money_Flow_Sum <= 3.90256e+06 )
									ret := -0.176471
								if( Positive_Money_Flow_Sum > 3.90256e+06 )
									ret := 0.500000
							if( Negative_Money_Flow_Sum > 1.27798e+08 )
								if( MFI <= 2.7632 )
									ret := -0.200000
								if( MFI > 2.7632 )
									ret := -0.811594 // sell
						if( Money_Flow_Ratio > 0.063595 )
							if( rsi1 <= 75.412 )
								if( Raw_Money_Flow <= 3.57589e+06 )
									ret := -0.014968
								if( Raw_Money_Flow > 3.57589e+06 )
									ret := -0.384091
							if( rsi1 > 75.412 )
								if( MFI_High <= 12.2558 )
									ret := -0.320325
								if( MFI_High > 12.2558 )
									ret := 0.131313
					if( Typical_Price > 181.59 )
						if( Negative_Money_Flow_Sum <= 4.80487e+06 )
							if( MFI_Low <= 53.8177 )
								if( smoothD_d <= 58.4964 )
									ret := -0.103448
								if( smoothD_d > 58.4964 )
									ret := -0.426407
							if( MFI_Low > 53.8177 )
								if( Money_Flow_Ratio <= 3.00148 )
									ret := 0.238095
								if( Money_Flow_Ratio > 3.00148 )
									ret := -0.190249
						if( Negative_Money_Flow_Sum > 4.80487e+06 )
							if( Negative_Money_Flow_Sum <= 5.48448e+06 )
								if( MFI_High <= -46.5408 )
									ret := 0.785714 // buy
								if( MFI_High > -46.5408 )
									ret := 0.138298
							if( Negative_Money_Flow_Sum > 5.48448e+06 )
								if( Positive_Money_Flow <= 347049 )
									ret := 0.021631
								if( Positive_Money_Flow > 347049 )
									ret := -0.252459
				if( Positive_Money_Flow_Sum > 2.81198e+07 )
					if( Negative_Money_Flow_Sum <= 5.29039e+07 )
						if( Typical_Price <= 160.178 )
							if( Positive_Money_Flow <= 3.10695e+06 )
								if( smoothD_d <= 90.9467 )
									ret := -0.750000 // sell
								if( smoothD_d > 90.9467 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow > 3.10695e+06 )
								if( k <= 71.2565 )
									ret := 0.857143 // buy
								if( k > 71.2565 )
									ret := -0.454545
						if( Typical_Price > 160.178 )
							if( rsi1 <= 64.332 )
								if( Money_Flow_Ratio <= 9.11481 )
									ret := 0.015072
								if( Money_Flow_Ratio > 9.11481 )
									ret := 0.278592
							if( rsi1 > 64.332 )
								if( Money_Flow_Ratio <= 8.23519 )
									ret := 0.137643
								if( Money_Flow_Ratio > 8.23519 )
									ret := -0.087423
					if( Negative_Money_Flow_Sum > 5.29039e+07 )
						if( MFI_High <= -13.2165 )
							if( Typical_Price <= 160.555 )
								if( Money_Flow_Ratio <= 0.91503 )
									ret := 0.950000 // buy
								if( Money_Flow_Ratio > 0.91503 )
									ret := 0.552632
							if( Typical_Price > 160.555 )
								if( rsi1 <= 33.691 )
									ret := -0.243408
								if( rsi1 > 33.691 )
									ret := 0.011376
						if( MFI_High > -13.2165 )
							if( Positive_Money_Flow_Sum <= 5.50248e+08 )
								if( MFI <= 82.1631 )
									ret := -0.146341
								if( MFI > 82.1631 )
									ret := -0.644970
							if( Positive_Money_Flow_Sum > 5.50248e+08 )
								if( Typical_Price <= 182.631 )
									ret := 0.323899
								if( Typical_Price > 182.631 )
									ret := -0.060748
			if( Typical_Price > 186.865 )
				if( Positive_Money_Flow_Sum <= 1.25877e+08 )
					if( Positive_Money_Flow_Sum <= 1.09921e+08 )
						if( d_k <= -19.0425 )
							if( Money_Flow_Ratio <= 0.666859 )
								if( Typical_Price <= 196.607 )
									ret := -0.391304
								if( Typical_Price > 196.607 )
									ret := 0.125000
							if( Money_Flow_Ratio > 0.666859 )
								if( Raw_Money_Flow <= 459572 )
									ret := -0.324324
								if( Raw_Money_Flow > 459572 )
									ret := 0.211230
						if( d_k > -19.0425 )
							if( Negative_Money_Flow <= 7.04106e+06 )
								if( Raw_Money_Flow <= 6.70332e+06 )
									ret := -0.106978
								if( Raw_Money_Flow > 6.70332e+06 )
									ret := 0.001533
							if( Negative_Money_Flow > 7.04106e+06 )
								if( Money_Flow_Ratio <= 0.655928 )
									ret := 0.016548
								if( Money_Flow_Ratio > 0.655928 )
									ret := -0.325978
					if( Positive_Money_Flow_Sum > 1.09921e+08 )
						if( Positive_Money_Flow_Sum <= 1.1365e+08 )
							if( Positive_Money_Flow <= 1.64974e+07 )
								if( rsi1 <= 39.5011 )
									ret := 1.000000 // buy
								if( rsi1 > 39.5011 )
									ret := 0.205882
							if( Positive_Money_Flow > 1.64974e+07 )
								if( smoothD_d <= 54.7626 )
									ret := 0.454545
								if( smoothD_d > 54.7626 )
									ret := 0.925000 // buy
						if( Positive_Money_Flow_Sum > 1.1365e+08 )
							if( rsi1 <= 65.079 )
								if( MFI <= 45.5264 )
									ret := -0.173913
								if( MFI > 45.5264 )
									ret := 0.330961
							if( rsi1 > 65.079 )
								if( smoothD_d <= 89.5652 )
									ret := -0.023952
								if( smoothD_d > 89.5652 )
									ret := -0.494253
				if( Positive_Money_Flow_Sum > 1.25877e+08 )
					if( smoothK_k <= 90.1247 )
						if( smoothK_k <= 86.1774 )
							if( rsi1 <= 34.7801 )
								if( Positive_Money_Flow_Sum <= 1.4366e+08 )
									ret := -0.181818
								if( Positive_Money_Flow_Sum > 1.4366e+08 )
									ret := 0.684211
							if( rsi1 > 34.7801 )
								if( Typical_Price <= 193.803 )
									ret := -0.180420
								if( Typical_Price > 193.803 )
									ret := -0.355528
						if( smoothK_k > 86.1774 )
							if( Negative_Money_Flow_Sum <= 7.39986e+07 )
								if( Negative_Money_Flow_Sum <= 6.06666e+07 )
									ret := -0.358779
								if( Negative_Money_Flow_Sum > 6.06666e+07 )
									ret := 0.437500
							if( Negative_Money_Flow_Sum > 7.39986e+07 )
								if( MFI_Low <= 59.6713 )
									ret := -0.616034
								if( MFI_Low > 59.6713 )
									ret := 0.076923
					if( smoothK_k > 90.1247 )
						if( Positive_Money_Flow <= 5.53488e+07 )
							if( MFI <= 86.908 )
								if( Money_Flow_Ratio <= 4.29511 )
									ret := -0.005891
								if( Money_Flow_Ratio > 4.29511 )
									ret := -0.452703
							if( MFI > 86.908 )
								if( Negative_Money_Flow_Sum <= 1.80115e+07 )
									ret := -0.366667
								if( Negative_Money_Flow_Sum > 1.80115e+07 )
									ret := 0.320000
						if( Positive_Money_Flow > 5.53488e+07 )
							if( Positive_Money_Flow <= 7.0559e+07 )
								if( Money_Flow_Ratio <= 4.49793 )
									ret := -0.600000
								if( Money_Flow_Ratio > 4.49793 )
									ret := -0.941176 // sell
							if( Positive_Money_Flow > 7.0559e+07 )
								if( MFI_High <= 14.952 )
									ret := -0.390244
								if( MFI_High > 14.952 )
									ret := 0.692308
	
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


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_AMZN_1Min_85f031ea(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


