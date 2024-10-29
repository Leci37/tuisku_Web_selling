//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: SNAP_1Min_2MS0_81255c91 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_2MS0_81255c91", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_81255c91(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 52.1154 )
		if( Raw_Money_Flow <= 47382.7 )
			if( Negative_Money_Flow <= 3.03771 )
				if( rsi1 <= 41.5981 )
					if( Positive_Money_Flow_Sum <= 62391.5 )
						if( Positive_Money_Flow_Sum <= 4005.29 )
							if( Typical_Price <= 9.255 )
								ret := 0.000000
							if( Typical_Price > 9.255 )
								if( Typical_Price <= 15.49 )
									ret := -1.000000 // sell
								if( Typical_Price > 15.49 )
									ret := -0.375000
						if( Positive_Money_Flow_Sum > 4005.29 )
							if( Raw_Money_Flow <= 3159.7 )
								if( Typical_Price <= 10.783 )
									ret := 0.389313
								if( Typical_Price > 10.783 )
									ret := -0.095745
							if( Raw_Money_Flow > 3159.7 )
								if( Typical_Price <= 14.194 )
									ret := 0.339623
								if( Typical_Price > 14.194 )
									ret := 0.613497
					if( Positive_Money_Flow_Sum > 62391.5 )
						if( Typical_Price <= 9.6209 )
							if( Typical_Price <= 8.62167 )
								if( Positive_Money_Flow_Sum <= 123629 )
									ret := 0.888889 // buy
								if( Positive_Money_Flow_Sum > 123629 )
									ret := 0.000000
							if( Typical_Price > 8.62167 )
								if( MFI <= 35.1746 )
									ret := 0.054795
								if( MFI > 35.1746 )
									ret := -0.326316
						if( Typical_Price > 9.6209 )
							if( d_k <= -1.10966 )
								if( d <= 35.2818 )
									ret := -0.112745
								if( d > 35.2818 )
									ret := 0.233333
							if( d_k > -1.10966 )
								if( Negative_Money_Flow_Sum <= 121617 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 121617 )
									ret := 0.240964
				if( rsi1 > 41.5981 )
					if( Negative_Money_Flow_Sum <= 169507 )
						if( smoothK_k <= 19.8126 )
							if( Positive_Money_Flow <= 22095.8 )
								if( Typical_Price <= 12.3907 )
									ret := 0.261972
								if( Typical_Price > 12.3907 )
									ret := -0.049689
							if( Positive_Money_Flow > 22095.8 )
								if( rsi1 <= 48.1045 )
									ret := 0.000000
								if( rsi1 > 48.1045 )
									ret := -0.722222 // sell
						if( smoothK_k > 19.8126 )
							if( Positive_Money_Flow <= 63.9906 )
								if( Raw_Money_Flow <= 4874.69 )
									ret := 0.197232
								if( Raw_Money_Flow > 4874.69 )
									ret := -0.011494
							if( Positive_Money_Flow > 63.9906 )
								if( Negative_Money_Flow_Sum <= 73382.3 )
									ret := -0.199693
								if( Negative_Money_Flow_Sum > 73382.3 )
									ret := 0.033569
					if( Negative_Money_Flow_Sum > 169507 )
						if( smoothK_k <= 30.4924 )
							if( Positive_Money_Flow <= 13859.2 )
								if( rsi1 <= 43.4946 )
									ret := 0.173913
								if( rsi1 > 43.4946 )
									ret := -0.162393
							if( Positive_Money_Flow > 13859.2 )
								if( smoothD_d <= 12.8835 )
									ret := 0.380952
								if( smoothD_d > 12.8835 )
									ret := -0.069767
						if( smoothK_k > 30.4924 )
							if( Negative_Money_Flow_Sum <= 632814 )
								if( Negative_Money_Flow_Sum <= 602192 )
									ret := -0.322129
								if( Negative_Money_Flow_Sum > 602192 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 632814 )
								if( Typical_Price <= 8.62835 )
									ret := -0.666667
								if( Typical_Price > 8.62835 )
									ret := -0.085470
			if( Negative_Money_Flow > 3.03771 )
				if( d_k <= -1.6234 )
					if( Positive_Money_Flow_Sum <= 133733 )
						if( Positive_Money_Flow_Sum <= 73636.3 )
							if( Negative_Money_Flow_Sum <= 93459.9 )
								if( Positive_Money_Flow_Sum <= 67530.9 )
									ret := 0.386492
								if( Positive_Money_Flow_Sum > 67530.9 )
									ret := -0.450000
							if( Negative_Money_Flow_Sum > 93459.9 )
								if( rsi1 <= 27.0815 )
									ret := 0.769231 // buy
								if( rsi1 > 27.0815 )
									ret := 0.065789
						if( Positive_Money_Flow_Sum > 73636.3 )
							if( Raw_Money_Flow <= 11684.8 )
								if( Money_Flow_Ratio <= 0.378082 )
									ret := 0.031250
								if( Money_Flow_Ratio > 0.378082 )
									ret := 0.494382
							if( Raw_Money_Flow > 11684.8 )
								if( Positive_Money_Flow_Sum <= 75551.3 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 75551.3 )
									ret := 0.792453 // buy
					if( Positive_Money_Flow_Sum > 133733 )
						if( d_k <= -6.71891 )
							if( Raw_Money_Flow <= 40580 )
								if( MFI <= 93.3805 )
									ret := -0.022901
								if( MFI > 93.3805 )
									ret := -0.500000
							if( Raw_Money_Flow > 40580 )
								if( Negative_Money_Flow_Sum <= 1.01278e+06 )
									ret := 0.785714 // buy
								if( Negative_Money_Flow_Sum > 1.01278e+06 )
									ret := 0.181818
						if( d_k > -6.71891 )
							if( MFI <= 76.7209 )
								if( k <= 29.6514 )
									ret := 0.379310
								if( k > 29.6514 )
									ret := -0.010753
							if( MFI > 76.7209 )
								if( Positive_Money_Flow_Sum <= 5.11434e+06 )
									ret := 0.637931
								if( Positive_Money_Flow_Sum > 5.11434e+06 )
									ret := 0.136364
				if( d_k > -1.6234 )
					if( Typical_Price <= 15.14 )
						if( Negative_Money_Flow_Sum <= 700198 )
							if( MFI_Low <= 57.8805 )
								if( rsi1 <= 49.9701 )
									ret := 0.485095
								if( rsi1 > 49.9701 )
									ret := 0.325069
							if( MFI_Low > 57.8805 )
								if( Raw_Money_Flow <= 1041.08 )
									ret := -0.500000
								if( Raw_Money_Flow > 1041.08 )
									ret := 0.687970
						if( Negative_Money_Flow_Sum > 700198 )
							if( Negative_Money_Flow <= 25290.6 )
								if( MFI <= 4.25663 )
									ret := 0.767857 // buy
								if( MFI > 4.25663 )
									ret := 0.276923
							if( Negative_Money_Flow > 25290.6 )
								if( MFI <= 31.5117 )
									ret := 0.241379
								if( MFI > 31.5117 )
									ret := -0.132353
					if( Typical_Price > 15.14 )
						if( d <= 5.17094 )
							if( d_k <= 1.66761 )
								if( Typical_Price <= 15.5062 )
									ret := -0.357143
								if( Typical_Price > 15.5062 )
									ret := 0.218750
							if( d_k > 1.66761 )
								if( MFI_Low <= 8.76802 )
									ret := -0.666667
								if( MFI_Low > 8.76802 )
									ret := -0.100000
						if( d > 5.17094 )
							if( MFI_High <= -64.7253 )
								if( Positive_Money_Flow_Sum <= 16401.5 )
									ret := -0.272727
								if( Positive_Money_Flow_Sum > 16401.5 )
									ret := 0.711538 // buy
							if( MFI_High > -64.7253 )
								if( Negative_Money_Flow_Sum <= 141154 )
									ret := 0.393762
								if( Negative_Money_Flow_Sum > 141154 )
									ret := 0.101307
		if( Raw_Money_Flow > 47382.7 )
			if( Positive_Money_Flow_Sum <= 158441 )
				if( rsi1 <= 41.4157 )
					if( k <= 44.9979 )
						if( Negative_Money_Flow_Sum <= 168470 )
							if( d <= 17.6522 )
								if( MFI_Low <= 12.8615 )
									ret := -0.454545
								if( MFI_Low > 12.8615 )
									ret := 0.823529 // buy
							if( d > 17.6522 )
								if( Negative_Money_Flow_Sum <= 43460.3 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 43460.3 )
									ret := 0.835294 // buy
						if( Negative_Money_Flow_Sum > 168470 )
							if( Negative_Money_Flow_Sum <= 362948 )
								if( Typical_Price <= 10.2615 )
									ret := 0.562500
								if( Typical_Price > 10.2615 )
									ret := -0.162500
							if( Negative_Money_Flow_Sum > 362948 )
								if( d_k <= 20.5048 )
									ret := 0.523985
								if( d_k > 20.5048 )
									ret := -0.400000
					if( k > 44.9979 )
						if( Negative_Money_Flow <= 234047 )
							if( smoothK_k <= 59.7717 )
								if( Money_Flow_Ratio <= 0.435732 )
									ret := -0.071429
								if( Money_Flow_Ratio > 0.435732 )
									ret := 1.000000 // buy
							if( smoothK_k > 59.7717 )
								if( d <= 69.1264 )
									ret := 0.500000
								if( d > 69.1264 )
									ret := 0.937500 // buy
						if( Negative_Money_Flow > 234047 )
							if( k <= 63.5417 )
								if( Negative_Money_Flow <= 2.166e+06 )
									ret := -0.083333
								if( Negative_Money_Flow > 2.166e+06 )
									ret := -1.000000 // sell
							if( k > 63.5417 )
								ret := -1.000000 // sell
				if( rsi1 > 41.4157 )
					if( Positive_Money_Flow <= 60111.1 )
						if( Raw_Money_Flow <= 225793 )
							if( rsi1 <= 41.7352 )
								ret := -0.800000 // sell
							if( rsi1 > 41.7352 )
								if( Negative_Money_Flow <= 106862 )
									ret := 0.192893
								if( Negative_Money_Flow > 106862 )
									ret := 0.595745
						if( Raw_Money_Flow > 225793 )
							if( Positive_Money_Flow_Sum <= 65866.5 )
								if( Negative_Money_Flow <= 1.14628e+06 )
									ret := 0.000000
								if( Negative_Money_Flow > 1.14628e+06 )
									ret := 0.833333 // buy
							if( Positive_Money_Flow_Sum > 65866.5 )
								if( Raw_Money_Flow <= 2.32912e+06 )
									ret := -0.952381 // sell
								if( Raw_Money_Flow > 2.32912e+06 )
									ret := 0.000000
					if( Positive_Money_Flow > 60111.1 )
						if( d_k <= -2.01577 )
							if( Negative_Money_Flow_Sum <= 222758 )
								if( smoothK_k <= 16.9695 )
									ret := -0.750000 // sell
								if( smoothK_k > 16.9695 )
									ret := -0.166667
							if( Negative_Money_Flow_Sum > 222758 )
								ret := -1.000000 // sell
						if( d_k > -2.01577 )
							if( d <= 31.9686 )
								ret := -0.750000 // sell
							if( d > 31.9686 )
								ret := 0.500000
			if( Positive_Money_Flow_Sum > 158441 )
				if( Negative_Money_Flow <= 698093 )
					if( Positive_Money_Flow_Sum <= 2.02667e+07 )
						if( smoothD_d <= 4.2679 )
							if( MFI <= 69.2226 )
								if( Positive_Money_Flow_Sum <= 370786 )
									ret := 0.245509
								if( Positive_Money_Flow_Sum > 370786 )
									ret := -0.021670
							if( MFI > 69.2226 )
								if( Positive_Money_Flow_Sum <= 971580 )
									ret := 0.375000
								if( Positive_Money_Flow_Sum > 971580 )
									ret := -0.666667
						if( smoothD_d > 4.2679 )
							if( Positive_Money_Flow_Sum <= 2.89581e+06 )
								if( Money_Flow_Ratio <= 1.01533 )
									ret := 0.063583
								if( Money_Flow_Ratio > 1.01533 )
									ret := 0.159877
							if( Positive_Money_Flow_Sum > 2.89581e+06 )
								if( MFI_Low <= 1.36977 )
									ret := -0.333333
								if( MFI_Low > 1.36977 )
									ret := 0.025158
					if( Positive_Money_Flow_Sum > 2.02667e+07 )
						if( Negative_Money_Flow <= 245.609 )
							if( Negative_Money_Flow_Sum <= 2.76981e+07 )
								if( d_k <= 2.77903 )
									ret := -0.424658
								if( d_k > 2.77903 )
									ret := 0.391304
							if( Negative_Money_Flow_Sum > 2.76981e+07 )
								if( d_k <= 10.0723 )
									ret := 0.435185
								if( d_k > 10.0723 )
									ret := -0.714286 // sell
						if( Negative_Money_Flow > 245.609 )
							if( Money_Flow_Ratio <= 1.15572 )
								if( Negative_Money_Flow_Sum <= 2.73279e+07 )
									ret := 0.166667
								if( Negative_Money_Flow_Sum > 2.73279e+07 )
									ret := 0.919355 // buy
							if( Money_Flow_Ratio > 1.15572 )
								if( Negative_Money_Flow_Sum <= 1.94422e+07 )
									ret := 0.565789
								if( Negative_Money_Flow_Sum > 1.94422e+07 )
									ret := -0.666667
				if( Negative_Money_Flow > 698093 )
					if( Typical_Price <= 15.9028 )
						if( smoothD_d <= 52.977 )
							if( Negative_Money_Flow_Sum <= 3.57069e+07 )
								if( Typical_Price <= 13.1766 )
									ret := 0.117150
								if( Typical_Price > 13.1766 )
									ret := 0.224931
							if( Negative_Money_Flow_Sum > 3.57069e+07 )
								if( rsi1 <= 37.6942 )
									ret := 0.777778 // buy
								if( rsi1 > 37.6942 )
									ret := -0.400000
						if( smoothD_d > 52.977 )
							if( Positive_Money_Flow_Sum <= 3.82036e+07 )
								if( Raw_Money_Flow <= 6.04697e+06 )
									ret := 0.068218
								if( Raw_Money_Flow > 6.04697e+06 )
									ret := 0.640000
							if( Positive_Money_Flow_Sum > 3.82036e+07 )
								if( Money_Flow_Ratio <= 0.717521 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.717521 )
									ret := -0.533333
					if( Typical_Price > 15.9028 )
						if( d_k <= -3.37191 )
							if( rsi1 <= 17.441 )
								if( MFI_High <= -74.372 )
									ret := 1.000000 // buy
								if( MFI_High > -74.372 )
									ret := 0.750000 // buy
							if( rsi1 > 17.441 )
								if( Positive_Money_Flow_Sum <= 1.90328e+06 )
									ret := -0.466667
								if( Positive_Money_Flow_Sum > 1.90328e+06 )
									ret := 0.335165
						if( d_k > -3.37191 )
							if( MFI_Low <= -8.33581 )
								if( Negative_Money_Flow_Sum <= 1.37049e+07 )
									ret := -0.603175
								if( Negative_Money_Flow_Sum > 1.37049e+07 )
									ret := 0.000000
							if( MFI_Low > -8.33581 )
								if( rsi1 <= 45.801 )
									ret := -0.090461
								if( rsi1 > 45.801 )
									ret := 0.170330
	if( rsi1 > 52.1154 )
		if( Negative_Money_Flow_Sum <= 77191.2 )
			if( Positive_Money_Flow <= 4.59228 )
				if( rsi1 <= 64.9978 )
					if( d_k <= -8.01311 )
						if( rsi1 <= 54.4401 )
							if( smoothK_k <= 65.188 )
								if( Negative_Money_Flow_Sum <= 37072.4 )
									ret := -0.411765
								if( Negative_Money_Flow_Sum > 37072.4 )
									ret := 0.150000
							if( smoothK_k > 65.188 )
								if( Typical_Price <= 15.305 )
									ret := 0.687500
								if( Typical_Price > 15.305 )
									ret := 0.000000
						if( rsi1 > 54.4401 )
							if( Positive_Money_Flow_Sum <= 14536.5 )
								if( Money_Flow_Ratio <= 0.553643 )
									ret := -0.142857
								if( Money_Flow_Ratio > 0.553643 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 14536.5 )
								if( Positive_Money_Flow_Sum <= 67566.5 )
									ret := -0.440000
								if( Positive_Money_Flow_Sum > 67566.5 )
									ret := -0.156863
					if( d_k > -8.01311 )
						if( Positive_Money_Flow_Sum <= 127999 )
							if( MFI <= 73.0682 )
								if( Negative_Money_Flow_Sum <= 54073.3 )
									ret := -0.002532
								if( Negative_Money_Flow_Sum > 54073.3 )
									ret := 0.290698
							if( MFI > 73.0682 )
								if( Negative_Money_Flow <= 35.4987 )
									ret := 0.183673
								if( Negative_Money_Flow > 35.4987 )
									ret := 0.602941
						if( Positive_Money_Flow_Sum > 127999 )
							if( Positive_Money_Flow_Sum <= 140455 )
								if( Typical_Price <= 11.528 )
									ret := -0.733333 // sell
								if( Typical_Price > 11.528 )
									ret := -0.153846
							if( Positive_Money_Flow_Sum > 140455 )
								if( Negative_Money_Flow_Sum <= 40363.8 )
									ret := 0.245455
								if( Negative_Money_Flow_Sum > 40363.8 )
									ret := -0.073529
				if( rsi1 > 64.9978 )
					if( Positive_Money_Flow_Sum <= 110511 )
						if( Positive_Money_Flow_Sum <= 50460.5 )
							if( MFI_High <= -45.8802 )
								if( Typical_Price <= 10.145 )
									ret := -0.250000
								if( Typical_Price > 10.145 )
									ret := 0.800000 // buy
							if( MFI_High > -45.8802 )
								if( Raw_Money_Flow <= 1525.38 )
									ret := 0.142857
								if( Raw_Money_Flow > 1525.38 )
									ret := -0.435897
						if( Positive_Money_Flow_Sum > 50460.5 )
							if( Money_Flow_Ratio <= 1.89777 )
								if( Negative_Money_Flow_Sum <= 33808 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 33808 )
									ret := 0.027027
							if( Money_Flow_Ratio > 1.89777 )
								if( d_k <= 6.37876 )
									ret := 0.366667
								if( d_k > 6.37876 )
									ret := -0.071429
					if( Positive_Money_Flow_Sum > 110511 )
						if( Negative_Money_Flow <= 13800.6 )
							if( k <= 93.9145 )
								if( Positive_Money_Flow_Sum <= 116539 )
									ret := -0.833333 // sell
								if( Positive_Money_Flow_Sum > 116539 )
									ret := -0.069767
							if( k > 93.9145 )
								if( Positive_Money_Flow_Sum <= 282038 )
									ret := -0.656250
								if( Positive_Money_Flow_Sum > 282038 )
									ret := -0.200000
						if( Negative_Money_Flow > 13800.6 )
							if( Money_Flow_Ratio <= 3.18615 )
								ret := -0.285714
							if( Money_Flow_Ratio > 3.18615 )
								if( smoothD_d <= 94.498 )
									ret := -0.900000 // sell
								if( smoothD_d > 94.498 )
									ret := -0.400000
			if( Positive_Money_Flow > 4.59228 )
				if( smoothD_d <= 62.9668 )
					if( Positive_Money_Flow <= 34979.3 )
						if( Negative_Money_Flow_Sum <= 39449.4 )
							if( Money_Flow_Ratio <= 9.67995 )
								if( Positive_Money_Flow_Sum <= 118553 )
									ret := -0.254854
								if( Positive_Money_Flow_Sum > 118553 )
									ret := 0.204082
							if( Money_Flow_Ratio > 9.67995 )
								if( rsi1 <= 58.4162 )
									ret := -0.347826
								if( rsi1 > 58.4162 )
									ret := -0.698413
						if( Negative_Money_Flow_Sum > 39449.4 )
							if( d_k <= 12.272 )
								if( Positive_Money_Flow <= 2755.14 )
									ret := -0.606742
								if( Positive_Money_Flow > 2755.14 )
									ret := -0.337705
							if( d_k > 12.272 )
								if( MFI <= 61.0967 )
									ret := 0.615385
								if( MFI > 61.0967 )
									ret := -0.300000
					if( Positive_Money_Flow > 34979.3 )
						if( Negative_Money_Flow_Sum <= 47471.8 )
							if( d_k <= 7.72207 )
								if( smoothK_k <= 53.9312 )
									ret := -0.920000 // sell
								if( smoothK_k > 53.9312 )
									ret := -0.640000
							if( d_k > 7.72207 )
								ret := 0.400000
						if( Negative_Money_Flow_Sum > 47471.8 )
							if( Typical_Price <= 15.2618 )
								if( d <= 42.3575 )
									ret := -0.689655
								if( d > 42.3575 )
									ret := -0.022222
							if( Typical_Price > 15.2618 )
								if( Money_Flow_Ratio <= 1.69543 )
									ret := -0.500000
								if( Money_Flow_Ratio > 1.69543 )
									ret := -1.000000 // sell
				if( smoothD_d > 62.9668 )
					if( rsi1 <= 58.1861 )
						if( Negative_Money_Flow <= 5.89741 )
							if( Positive_Money_Flow_Sum <= 44275.4 )
								if( Typical_Price <= 9.26922 )
									ret := 0.111111
								if( Typical_Price > 9.26922 )
									ret := -0.488372
							if( Positive_Money_Flow_Sum > 44275.4 )
								if( Raw_Money_Flow <= 13379.4 )
									ret := -0.079545
								if( Raw_Money_Flow > 13379.4 )
									ret := 0.339286
						if( Negative_Money_Flow > 5.89741 )
							if( Money_Flow_Ratio <= 2.96061 )
								if( Negative_Money_Flow_Sum <= 54615.6 )
									ret := 0.529412
								if( Negative_Money_Flow_Sum > 54615.6 )
									ret := -1.000000 // sell
							if( Money_Flow_Ratio > 2.96061 )
								ret := 1.000000 // buy
					if( rsi1 > 58.1861 )
						if( Positive_Money_Flow <= 218756 )
							if( Positive_Money_Flow_Sum <= 200829 )
								if( d_k <= 14.067 )
									ret := -0.275449
								if( d_k > 14.067 )
									ret := 0.875000 // buy
							if( Positive_Money_Flow_Sum > 200829 )
								if( smoothD_d <= 85.2004 )
									ret := -0.407186
								if( smoothD_d > 85.2004 )
									ret := -0.794872 // sell
						if( Positive_Money_Flow > 218756 )
							if( smoothK_k <= 73.0036 )
								if( Negative_Money_Flow_Sum <= 50096.1 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 50096.1 )
									ret := -0.500000
							if( smoothK_k > 73.0036 )
								if( Positive_Money_Flow_Sum <= 6.60391e+06 )
									ret := 0.388060
								if( Positive_Money_Flow_Sum > 6.60391e+06 )
									ret := -0.800000 // sell
		if( Negative_Money_Flow_Sum > 77191.2 )
			if( MFI_Low <= 41.5462 )
				if( Positive_Money_Flow_Sum <= 4.13265e+07 )
					if( k <= 47.3635 )
						if( Positive_Money_Flow_Sum <= 41501.3 )
							if( Negative_Money_Flow <= 1140.66 )
								if( d_k <= 8.77611 )
									ret := -0.616438
								if( d_k > 8.77611 )
									ret := 0.333333
							if( Negative_Money_Flow > 1140.66 )
								if( Negative_Money_Flow_Sum <= 104028 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow_Sum > 104028 )
									ret := -0.090909
						if( Positive_Money_Flow_Sum > 41501.3 )
							if( Negative_Money_Flow_Sum <= 2.62773e+07 )
								if( Positive_Money_Flow_Sum <= 2.49132e+07 )
									ret := -0.017186
								if( Positive_Money_Flow_Sum > 2.49132e+07 )
									ret := 0.804878 // buy
							if( Negative_Money_Flow_Sum > 2.62773e+07 )
								if( MFI_Low <= -18.8267 )
									ret := 0.400000
								if( MFI_Low > -18.8267 )
									ret := -0.622642
					if( k > 47.3635 )
						if( Typical_Price <= 9.84257 )
							if( Positive_Money_Flow_Sum <= 5.72281e+06 )
								if( Negative_Money_Flow_Sum <= 115322 )
									ret := 0.245714
								if( Negative_Money_Flow_Sum > 115322 )
									ret := -0.068076
							if( Positive_Money_Flow_Sum > 5.72281e+06 )
								if( Money_Flow_Ratio <= 1.29516 )
									ret := 0.033333
								if( Money_Flow_Ratio > 1.29516 )
									ret := 0.461538
						if( Typical_Price > 9.84257 )
							if( MFI_Low <= 6.59645 )
								if( Raw_Money_Flow <= 2.99279e+06 )
									ret := -0.069170
								if( Raw_Money_Flow > 2.99279e+06 )
									ret := -0.956522 // sell
							if( MFI_Low > 6.59645 )
								if( d_k <= 7.17009 )
									ret := 0.134275
								if( d_k > 7.17009 )
									ret := -0.019980
				if( Positive_Money_Flow_Sum > 4.13265e+07 )
					if( rsi1 <= 66.2354 )
						if( d_k <= 7.72609 )
							if( Raw_Money_Flow <= 1.01523e+07 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 1.01523e+07 )
								ret := -0.833333 // sell
						if( d_k > 7.72609 )
							if( rsi1 <= 59.0356 )
								ret := -1.000000 // sell
							if( rsi1 > 59.0356 )
								ret := 0.250000
					if( rsi1 > 66.2354 )
						if( Positive_Money_Flow_Sum <= 5.00159e+07 )
							ret := 0.285714
						if( Positive_Money_Flow_Sum > 5.00159e+07 )
							ret := -0.800000 // sell
			if( MFI_Low > 41.5462 )
				if( d_k <= 0.624516 )
					if( Positive_Money_Flow_Sum <= 1.56995e+07 )
						if( Money_Flow_Ratio <= 32.7284 )
							if( Positive_Money_Flow <= 380487 )
								if( Money_Flow_Ratio <= 3.88386 )
									ret := -0.053237
								if( Money_Flow_Ratio > 3.88386 )
									ret := -0.167593
							if( Positive_Money_Flow > 380487 )
								if( Positive_Money_Flow_Sum <= 1.5336e+07 )
									ret := -0.002769
								if( Positive_Money_Flow_Sum > 1.5336e+07 )
									ret := 0.642857
						if( Money_Flow_Ratio > 32.7284 )
							if( Negative_Money_Flow_Sum <= 127182 )
								if( MFI <= 97.0522 )
									ret := 1.000000 // buy
								if( MFI > 97.0522 )
									ret := -0.384615
							if( Negative_Money_Flow_Sum > 127182 )
								if( MFI <= 94.3954 )
									ret := 0.000000
								if( MFI > 94.3954 )
									ret := -0.708333 // sell
					if( Positive_Money_Flow_Sum > 1.56995e+07 )
						if( MFI <= 65.2988 )
							if( Raw_Money_Flow <= 1.94637e+06 )
								if( Positive_Money_Flow <= 3894.31 )
									ret := -0.500000
								if( Positive_Money_Flow > 3894.31 )
									ret := -0.972222 // sell
							if( Raw_Money_Flow > 1.94637e+06 )
								if( Typical_Price <= 11.3092 )
									ret := 0.750000 // buy
								if( Typical_Price > 11.3092 )
									ret := -0.561404
						if( MFI > 65.2988 )
							if( MFI_High <= -13.4783 )
								if( Negative_Money_Flow_Sum <= 8.74006e+06 )
									ret := -0.888889 // sell
								if( Negative_Money_Flow_Sum > 8.74006e+06 )
									ret := 0.500000
							if( MFI_High > -13.4783 )
								if( Positive_Money_Flow <= 44.5901 )
									ret := -0.046667
								if( Positive_Money_Flow > 44.5901 )
									ret := -0.415913
				if( d_k > 0.624516 )
					if( MFI_Low <= 59.9285 )
						if( Negative_Money_Flow_Sum <= 1.11982e+07 )
							if( Money_Flow_Ratio <= 2.16929 )
								if( Positive_Money_Flow <= 365506 )
									ret := -0.049815
								if( Positive_Money_Flow > 365506 )
									ret := 0.185921
							if( Money_Flow_Ratio > 2.16929 )
								if( Positive_Money_Flow_Sum <= 2.92956e+06 )
									ret := -0.009639
								if( Positive_Money_Flow_Sum > 2.92956e+06 )
									ret := -0.147527
						if( Negative_Money_Flow_Sum > 1.11982e+07 )
							if( Raw_Money_Flow <= 6.1163e+06 )
								if( Raw_Money_Flow <= 511930 )
									ret := -0.285714
								if( Raw_Money_Flow > 511930 )
									ret := 0.547445
							if( Raw_Money_Flow > 6.1163e+06 )
								if( Positive_Money_Flow_Sum <= 3.20848e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 3.20848e+07 )
									ret := -0.866667 // sell
					if( MFI_Low > 59.9285 )
						if( Positive_Money_Flow <= 357468 )
							if( Positive_Money_Flow_Sum <= 5.59962e+07 )
								if( Negative_Money_Flow <= 513.487 )
									ret := -0.091324
								if( Negative_Money_Flow > 513.487 )
									ret := 0.111255
							if( Positive_Money_Flow_Sum > 5.59962e+07 )
								if( Positive_Money_Flow_Sum <= 2.0827e+08 )
									ret := 0.885714 // buy
								if( Positive_Money_Flow_Sum > 2.0827e+08 )
									ret := 0.000000
						if( Positive_Money_Flow > 357468 )
							if( rsi1 <= 82.8329 )
								if( Negative_Money_Flow_Sum <= 2.21138e+06 )
									ret := 0.307918
								if( Negative_Money_Flow_Sum > 2.21138e+06 )
									ret := 0.613260
							if( rsi1 > 82.8329 )
								if( Positive_Money_Flow_Sum <= 1.67695e+07 )
									ret := 0.208791
								if( Positive_Money_Flow_Sum > 1.67695e+07 )
									ret := -0.333333
	
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
float op_operation = decision_tree_0_SNAP_1Min_81255c91(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


