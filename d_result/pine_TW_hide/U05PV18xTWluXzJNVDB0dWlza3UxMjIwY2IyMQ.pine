//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: SNOW_1Min_2MT0_1220cb21 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_2MT0_1220cb21", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_1220cb21(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 11200.5 )
		if( Positive_Money_Flow <= 71126.6 )
			if( ema12 <= 0.00793 )
				if( Negative_Money_Flow <= 306.815 )
					if( Positive_Money_Flow_Sum <= 1.59686e+08 )
						if( ema12 <= -0.116123 )
							if( Negative_Money_Flow_Sum <= 562625 )
								if( Positive_Money_Flow <= 27008.5 )
									ret := -0.040816
								if( Positive_Money_Flow > 27008.5 )
									ret := 0.820513 // buy
							if( Negative_Money_Flow_Sum > 562625 )
								if( Negative_Money_Flow_Sum <= 641351 )
									ret := -0.526316
								if( Negative_Money_Flow_Sum > 641351 )
									ret := 0.143791
						if( ema12 > -0.116123 )
							if( Negative_Money_Flow_Sum <= 732664 )
								if( MFI_Low <= 8.1186 )
									ret := 0.370968
								if( MFI_Low > 8.1186 )
									ret := -0.035430
							if( Negative_Money_Flow_Sum > 732664 )
								if( ema13 <= -0.067694 )
									ret := -0.230947
								if( ema13 > -0.067694 )
									ret := 0.007833
					if( Positive_Money_Flow_Sum > 1.59686e+08 )
						if( ema12 <= -0.020233 )
							if( ema3 <= 159.445 )
								ret := 1.000000 // buy
							if( ema3 > 159.445 )
								ret := 0.250000
						if( ema12 > -0.020233 )
							ret := 0.000000
				if( Negative_Money_Flow > 306.815 )
					if( Raw_Money_Flow <= 15559.6 )
						if( ema3 <= 118.299 )
							if( Positive_Money_Flow_Sum <= 297083 )
								if( MFI_High <= -44.4465 )
									ret := -0.250000
								if( MFI_High > -44.4465 )
									ret := 0.888889 // buy
							if( Positive_Money_Flow_Sum > 297083 )
								if( Positive_Money_Flow <= 1766.19 )
									ret := 0.200000
								if( Positive_Money_Flow > 1766.19 )
									ret := -0.714286 // sell
						if( ema3 > 118.299 )
							if( Positive_Money_Flow <= 8254.93 )
								if( Positive_Money_Flow <= 3632.81 )
									ret := -0.428571
								if( Positive_Money_Flow > 3632.81 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow > 8254.93 )
								ret := 0.142857
					if( Raw_Money_Flow > 15559.6 )
						if( ema13 <= -0.000572 )
							if( Positive_Money_Flow_Sum <= 2.55413e+06 )
								if( Positive_Money_Flow_Sum <= 1.22801e+06 )
									ret := 0.270833
								if( Positive_Money_Flow_Sum > 1.22801e+06 )
									ret := -0.636364
							if( Positive_Money_Flow_Sum > 2.55413e+06 )
								if( ema13 <= -0.440956 )
									ret := 0.500000
								if( ema13 > -0.440956 )
									ret := 1.000000 // buy
						if( ema13 > -0.000572 )
							if( MFI <= 74.8791 )
								ret := 1.000000 // buy
							if( MFI > 74.8791 )
								ret := 0.333333
			if( ema12 > 0.00793 )
				if( Money_Flow_Ratio <= 0.620322 )
					if( Positive_Money_Flow_Sum <= 84621.8 )
						if( ema1 <= 134.723 )
							if( Positive_Money_Flow_Sum <= 63772.4 )
								ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 63772.4 )
								ret := 1.000000 // buy
						if( ema1 > 134.723 )
							ret := 0.000000
					if( Positive_Money_Flow_Sum > 84621.8 )
						if( ema13 <= 0.388429 )
							if( ema1 <= 148.032 )
								if( Positive_Money_Flow_Sum <= 584929 )
									ret := -0.121662
								if( Positive_Money_Flow_Sum > 584929 )
									ret := 0.142857
							if( ema1 > 148.032 )
								if( ema12 <= 0.062511 )
									ret := 0.065217
								if( ema12 > 0.062511 )
									ret := -0.619048
						if( ema13 > 0.388429 )
							if( Money_Flow_Ratio <= 0.272602 )
								ret := -0.800000 // sell
							if( Money_Flow_Ratio > 0.272602 )
								if( Positive_Money_Flow <= 28466.6 )
									ret := 0.791667 // buy
								if( Positive_Money_Flow > 28466.6 )
									ret := 0.250000
				if( Money_Flow_Ratio > 0.620322 )
					if( Positive_Money_Flow <= 23.6729 )
						if( Positive_Money_Flow_Sum <= 874951 )
							if( tema <= 119.279 )
								if( ema1 <= 113.537 )
									ret := -0.181818
								if( ema1 > 113.537 )
									ret := -0.629630
							if( tema > 119.279 )
								if( Negative_Money_Flow <= 239.812 )
									ret := 0.069364
								if( Negative_Money_Flow > 239.812 )
									ret := 0.600000
						if( Positive_Money_Flow_Sum > 874951 )
							if( ema13 <= 0.112709 )
								if( Positive_Money_Flow_Sum <= 1.50301e+06 )
									ret := -0.523810
								if( Positive_Money_Flow_Sum > 1.50301e+06 )
									ret := 0.097561
							if( ema13 > 0.112709 )
								if( MFI_High <= 9.20462 )
									ret := -0.288889
								if( MFI_High > 9.20462 )
									ret := -0.677419
					if( Positive_Money_Flow > 23.6729 )
						if( ema12 <= 0.279966 )
							if( Positive_Money_Flow <= 31311.2 )
								if( ema12 <= 0.105463 )
									ret := -0.384365
								if( ema12 > 0.105463 )
									ret := -0.701422 // sell
							if( Positive_Money_Flow > 31311.2 )
								if( ema2 <= 114.073 )
									ret := 0.092857
								if( ema2 > 114.073 )
									ret := -0.308605
						if( ema12 > 0.279966 )
							if( Negative_Money_Flow_Sum <= 371780 )
								if( Raw_Money_Flow <= 54257.3 )
									ret := 0.450704
								if( Raw_Money_Flow > 54257.3 )
									ret := -0.411765
							if( Negative_Money_Flow_Sum > 371780 )
								if( Typical_Price <= 111.41 )
									ret := 0.500000
								if( Typical_Price > 111.41 )
									ret := -0.589744
		if( Positive_Money_Flow > 71126.6 )
			if( ema3 <= 134.893 )
				if( Positive_Money_Flow_Sum <= 4.23069e+06 )
					if( MFI_High <= -47.3621 )
						if( Negative_Money_Flow_Sum <= 1.47292e+07 )
							if( Negative_Money_Flow_Sum <= 1.30525e+07 )
								if( Positive_Money_Flow_Sum <= 894058 )
									ret := -0.107438
								if( Positive_Money_Flow_Sum > 894058 )
									ret := 0.115693
							if( Negative_Money_Flow_Sum > 1.30525e+07 )
								if( ema12 <= -0.058623 )
									ret := 0.600000
								if( ema12 > -0.058623 )
									ret := -0.176471
						if( Negative_Money_Flow_Sum > 1.47292e+07 )
							if( Negative_Money_Flow_Sum <= 1.76914e+08 )
								if( ema13 <= -0.84421 )
									ret := 0.833333 // buy
								if( ema13 > -0.84421 )
									ret := -0.307692
							if( Negative_Money_Flow_Sum > 1.76914e+08 )
								if( Negative_Money_Flow_Sum <= 1.96914e+08 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 1.96914e+08 )
									ret := 0.400000
					if( MFI_High > -47.3621 )
						if( Positive_Money_Flow_Sum <= 488699 )
							if( ema13 <= -0.597251 )
								if( ema3 <= 113.866 )
									ret := -0.500000
								if( ema3 > 113.866 )
									ret := -1.000000 // sell
							if( ema13 > -0.597251 )
								if( Typical_Price <= 113.249 )
									ret := -0.122807
								if( Typical_Price > 113.249 )
									ret := 0.343750
						if( Positive_Money_Flow_Sum > 488699 )
							if( Positive_Money_Flow_Sum <= 796721 )
								if( Positive_Money_Flow <= 274925 )
									ret := -0.159744
								if( Positive_Money_Flow > 274925 )
									ret := -0.626866
							if( Positive_Money_Flow_Sum > 796721 )
								if( Negative_Money_Flow_Sum <= 3.64125e+06 )
									ret := 0.011457
								if( Negative_Money_Flow_Sum > 3.64125e+06 )
									ret := -0.140940
				if( Positive_Money_Flow_Sum > 4.23069e+06 )
					if( ema12 <= -0.327174 )
						if( Negative_Money_Flow_Sum <= 8.84276e+07 )
							if( Positive_Money_Flow_Sum <= 5.79872e+07 )
								if( Positive_Money_Flow_Sum <= 2.59924e+07 )
									ret := 0.641304
								if( Positive_Money_Flow_Sum > 2.59924e+07 )
									ret := -0.384615
							if( Positive_Money_Flow_Sum > 5.79872e+07 )
								if( Raw_Money_Flow <= 1.22818e+06 )
									ret := 0.500000
								if( Raw_Money_Flow > 1.22818e+06 )
									ret := 0.972222 // buy
						if( Negative_Money_Flow_Sum > 8.84276e+07 )
							if( tema <= 126.623 )
								if( ema2 <= 131.664 )
									ret := 0.148936
								if( ema2 > 131.664 )
									ret := 1.000000 // buy
							if( tema > 126.623 )
								if( Positive_Money_Flow_Sum <= 5.05044e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 5.05044e+07 )
									ret := -0.500000
					if( ema12 > -0.327174 )
						if( ema13 <= 0.84185 )
							if( Money_Flow_Ratio <= 1.52822 )
								if( Raw_Money_Flow <= 3.47957e+06 )
									ret := 0.023568
								if( Raw_Money_Flow > 3.47957e+06 )
									ret := 0.144269
							if( Money_Flow_Ratio > 1.52822 )
								if( Negative_Money_Flow_Sum <= 1.22729e+07 )
									ret := 0.094517
								if( Negative_Money_Flow_Sum > 1.22729e+07 )
									ret := 0.257172
						if( ema13 > 0.84185 )
							if( MFI_Low <= 76.8346 )
								if( ema12 <= 0.656023 )
									ret := -0.492308
								if( ema12 > 0.656023 )
									ret := -0.960000 // sell
							if( MFI_Low > 76.8346 )
								if( MFI_High <= 19.1885 )
									ret := 1.000000 // buy
								if( MFI_High > 19.1885 )
									ret := 0.666667
			if( ema3 > 134.893 )
				if( ema12 <= 0.581066 )
					if( Negative_Money_Flow_Sum <= 158309 )
						if( MFI_High <= 14.8612 )
							if( Positive_Money_Flow_Sum <= 820153 )
								ret := -0.250000
							if( Positive_Money_Flow_Sum > 820153 )
								if( ema13 <= 0.046567 )
									ret := -0.600000
								if( ema13 > 0.046567 )
									ret := -0.952381 // sell
						if( MFI_High > 14.8612 )
							ret := -0.250000
					if( Negative_Money_Flow_Sum > 158309 )
						if( Negative_Money_Flow_Sum <= 7.58237e+06 )
							if( Positive_Money_Flow_Sum <= 9.92333e+06 )
								if( Positive_Money_Flow_Sum <= 8.2784e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 8.2784e+06 )
									ret := -0.217742
							if( Positive_Money_Flow_Sum > 9.92333e+06 )
								if( Raw_Money_Flow <= 869552 )
									ret := -0.041237
								if( Raw_Money_Flow > 869552 )
									ret := 0.163948
						if( Negative_Money_Flow_Sum > 7.58237e+06 )
							if( Raw_Money_Flow <= 641667 )
								if( ema12 <= 0.081817 )
									ret := 0.108779
								if( ema12 > 0.081817 )
									ret := -0.259259
							if( Raw_Money_Flow > 641667 )
								if( Raw_Money_Flow <= 5.32688e+06 )
									ret := -0.094710
								if( Raw_Money_Flow > 5.32688e+06 )
									ret := 0.097448
				if( ema12 > 0.581066 )
					if( ema3 <= 136.749 )
						ret := 0.000000
					if( ema3 > 136.749 )
						if( Positive_Money_Flow <= 266447 )
							ret := -0.250000
						if( Positive_Money_Flow > 266447 )
							if( MFI_High <= -13.9329 )
								ret := -0.571429
							if( MFI_High > -13.9329 )
								if( ema12 <= 0.632447 )
									ret := -0.750000 // sell
								if( ema12 > 0.632447 )
									ret := -1.000000 // sell
	if( Negative_Money_Flow > 11200.5 )
		if( Negative_Money_Flow <= 193562 )
			if( ema12 <= 0.008932 )
				if( Negative_Money_Flow_Sum <= 763025 )
					if( Positive_Money_Flow_Sum <= 1.51382e+06 )
						if( MFI_High <= -54.0336 )
							if( ema13 <= -0.732688 )
								if( MFI <= 23.7592 )
									ret := 0.166667
								if( MFI > 23.7592 )
									ret := -0.625000
							if( ema13 > -0.732688 )
								if( MFI_Low <= -2.15886 )
									ret := 0.240741
								if( MFI_Low > -2.15886 )
									ret := 0.650655
						if( MFI_High > -54.0336 )
							if( Money_Flow_Ratio <= 3.58628 )
								if( Positive_Money_Flow_Sum <= 715157 )
									ret := 0.272064
								if( Positive_Money_Flow_Sum > 715157 )
									ret := 0.504132
							if( Money_Flow_Ratio > 3.58628 )
								if( ema3 <= 134.393 )
									ret := 0.171429
								if( ema3 > 134.393 )
									ret := -0.666667
					if( Positive_Money_Flow_Sum > 1.51382e+06 )
						if( Positive_Money_Flow_Sum <= 5.04512e+06 )
							if( Raw_Money_Flow <= 15736.7 )
								ret := 0.000000
							if( Raw_Money_Flow > 15736.7 )
								if( ema1 <= 114.957 )
									ret := 0.484848
								if( ema1 > 114.957 )
									ret := 0.777778 // buy
						if( Positive_Money_Flow_Sum > 5.04512e+06 )
							if( MFI <= 97.1832 )
								if( Positive_Money_Flow_Sum <= 6.93983e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 6.93983e+06 )
									ret := -0.500000
							if( MFI > 97.1832 )
								if( Negative_Money_Flow_Sum <= 608628 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 608628 )
									ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 763025 )
					if( Negative_Money_Flow <= 128807 )
						if( Positive_Money_Flow_Sum <= 797853 )
							if( Negative_Money_Flow_Sum <= 820706 )
								if( Positive_Money_Flow <= 1083.48 )
									ret := -0.089744
								if( Positive_Money_Flow > 1083.48 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 820706 )
								if( Money_Flow_Ratio <= 0.007735 )
									ret := -0.333333
								if( Money_Flow_Ratio > 0.007735 )
									ret := 0.211886
						if( Positive_Money_Flow_Sum > 797853 )
							if( Typical_Price <= 109.05 )
								if( MFI <= 58.9618 )
									ret := 0.000000
								if( MFI > 58.9618 )
									ret := -1.000000 // sell
							if( Typical_Price > 109.05 )
								if( ema12 <= -0.182552 )
									ret := 0.517045
								if( ema12 > -0.182552 )
									ret := 0.327210
					if( Negative_Money_Flow > 128807 )
						if( Negative_Money_Flow_Sum <= 2.0214e+06 )
							if( ema13 <= -0.318507 )
								if( Positive_Money_Flow_Sum <= 365978 )
									ret := -0.954545 // sell
								if( Positive_Money_Flow_Sum > 365978 )
									ret := -0.160000
							if( ema13 > -0.318507 )
								if( MFI_High <= -51.2398 )
									ret := 0.327869
								if( MFI_High > -51.2398 )
									ret := -0.186916
						if( Negative_Money_Flow_Sum > 2.0214e+06 )
							if( ema12 <= -0.157233 )
								if( ema12 <= -0.478425 )
									ret := -0.076923
								if( ema12 > -0.478425 )
									ret := 0.702128 // buy
							if( ema12 > -0.157233 )
								if( ema12 <= -0.052107 )
									ret := -0.101852
								if( ema12 > -0.052107 )
									ret := 0.174757
			if( ema12 > 0.008932 )
				if( ema3 <= 164.536 )
					if( Positive_Money_Flow_Sum <= 365575 )
						if( tema <= 116.2 )
							if( MFI <= 31.6143 )
								if( Negative_Money_Flow <= 23916.9 )
									ret := -0.166667
								if( Negative_Money_Flow > 23916.9 )
									ret := 0.657143
							if( MFI > 31.6143 )
								if( ema2 <= 109.837 )
									ret := 0.750000 // buy
								if( ema2 > 109.837 )
									ret := -0.205882
						if( tema > 116.2 )
							if( ema1 <= 131.117 )
								if( ema13 <= 0.081246 )
									ret := 0.333333
								if( ema13 > 0.081246 )
									ret := 0.718182 // buy
							if( ema1 > 131.117 )
								if( Negative_Money_Flow_Sum <= 5.95805e+06 )
									ret := 0.216000
								if( Negative_Money_Flow_Sum > 5.95805e+06 )
									ret := 0.916667 // buy
					if( Positive_Money_Flow_Sum > 365575 )
						if( Raw_Money_Flow <= 20531.1 )
							if( Money_Flow_Ratio <= 10.3199 )
								if( Negative_Money_Flow <= 16270.9 )
									ret := -0.377953
								if( Negative_Money_Flow > 16270.9 )
									ret := 0.013514
							if( Money_Flow_Ratio > 10.3199 )
								if( Money_Flow_Ratio <= 30.5656 )
									ret := 0.588235
								if( Money_Flow_Ratio > 30.5656 )
									ret := 0.000000
						if( Raw_Money_Flow > 20531.1 )
							if( ema2 <= 111.162 )
								if( Positive_Money_Flow <= 537.778 )
									ret := 0.007407
								if( Positive_Money_Flow > 537.778 )
									ret := -0.680000
							if( ema2 > 111.162 )
								if( ema12 <= 0.275765 )
									ret := 0.163549
								if( ema12 > 0.275765 )
									ret := -0.082474
				if( ema3 > 164.536 )
					if( Negative_Money_Flow_Sum <= 4.29133e+06 )
						if( Positive_Money_Flow <= 852.087 )
							if( Negative_Money_Flow_Sum <= 453223 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 453223 )
								if( MFI <= 62.4749 )
									ret := -0.448276
								if( MFI > 62.4749 )
									ret := 0.142857
						if( Positive_Money_Flow > 852.087 )
							ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 4.29133e+06 )
						ret := 0.400000
		if( Negative_Money_Flow > 193562 )
			if( Negative_Money_Flow_Sum <= 1.11721e+07 )
				if( Raw_Money_Flow <= 625462 )
					if( Negative_Money_Flow_Sum <= 7.05119e+06 )
						if( Money_Flow_Ratio <= 6.03552 )
							if( MFI <= 82.6597 )
								if( Positive_Money_Flow_Sum <= 850083 )
									ret := 0.155518
								if( Positive_Money_Flow_Sum > 850083 )
									ret := 0.023946
							if( MFI > 82.6597 )
								if( Negative_Money_Flow_Sum <= 1.85919e+06 )
									ret := 0.711111 // buy
								if( Negative_Money_Flow_Sum > 1.85919e+06 )
									ret := 0.161290
						if( Money_Flow_Ratio > 6.03552 )
							if( ema13 <= 0.299413 )
								if( Positive_Money_Flow_Sum <= 1.11071e+07 )
									ret := -0.545455
								if( Positive_Money_Flow_Sum > 1.11071e+07 )
									ret := 0.320000
							if( ema13 > 0.299413 )
								if( Negative_Money_Flow_Sum <= 931852 )
									ret := -0.200000
								if( Negative_Money_Flow_Sum > 931852 )
									ret := -0.861111 // sell
					if( Negative_Money_Flow_Sum > 7.05119e+06 )
						if( Negative_Money_Flow_Sum <= 9.96742e+06 )
							if( ema13 <= -0.336113 )
								if( Typical_Price <= 138.326 )
									ret := 0.842105 // buy
								if( Typical_Price > 138.326 )
									ret := 0.250000
							if( ema13 > -0.336113 )
								if( Negative_Money_Flow_Sum <= 9.85243e+06 )
									ret := 0.169730
								if( Negative_Money_Flow_Sum > 9.85243e+06 )
									ret := 0.619048
						if( Negative_Money_Flow_Sum > 9.96742e+06 )
							if( Raw_Money_Flow <= 317668 )
								if( MFI_High <= -61.0188 )
									ret := 1.000000 // buy
								if( MFI_High > -61.0188 )
									ret := 0.333333
							if( Raw_Money_Flow > 317668 )
								if( ema2 <= 109.641 )
									ret := 0.714286 // buy
								if( ema2 > 109.641 )
									ret := -0.181818
				if( Raw_Money_Flow > 625462 )
					if( Positive_Money_Flow_Sum <= 485276 )
						if( ema3 <= 131.38 )
							if( Raw_Money_Flow <= 1.46173e+06 )
								if( ema13 <= -0.067126 )
									ret := 0.851852 // buy
								if( ema13 > -0.067126 )
									ret := 0.000000
							if( Raw_Money_Flow > 1.46173e+06 )
								if( Negative_Money_Flow_Sum <= 3.13191e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 3.13191e+06 )
									ret := 0.333333
						if( ema3 > 131.38 )
							if( ema12 <= 0.049959 )
								if( Positive_Money_Flow_Sum <= 268714 )
									ret := 0.529412
								if( Positive_Money_Flow_Sum > 268714 )
									ret := 0.977778 // buy
							if( ema12 > 0.049959 )
								ret := 0.200000
					if( Positive_Money_Flow_Sum > 485276 )
						if( ema12 <= 0.214959 )
							if( ema12 <= -0.147189 )
								if( Positive_Money_Flow_Sum <= 3.45555e+06 )
									ret := -0.042042
								if( Positive_Money_Flow_Sum > 3.45555e+06 )
									ret := 0.306709
							if( ema12 > -0.147189 )
								if( MFI_High <= 3.13652 )
									ret := -0.053615
								if( MFI_High > 3.13652 )
									ret := 0.168367
						if( ema12 > 0.214959 )
							if( tema <= 137.295 )
								if( Positive_Money_Flow_Sum <= 5.64714e+07 )
									ret := 0.377483
								if( Positive_Money_Flow_Sum > 5.64714e+07 )
									ret := -0.642857
							if( tema > 137.295 )
								if( Raw_Money_Flow <= 1.48101e+06 )
									ret := 0.275000
								if( Raw_Money_Flow > 1.48101e+06 )
									ret := -0.462500
			if( Negative_Money_Flow_Sum > 1.11721e+07 )
				if( Positive_Money_Flow_Sum <= 3.16154e+06 )
					if( Raw_Money_Flow <= 1.08409e+07 )
						if( ema12 <= -0.617236 )
							if( ema2 <= 158.908 )
								if( MFI_Low <= -18.6587 )
									ret := 0.800000 // buy
								if( MFI_Low > -18.6587 )
									ret := 1.000000 // buy
							if( ema2 > 158.908 )
								ret := 0.200000
						if( ema12 > -0.617236 )
							if( ema12 <= -0.313413 )
								if( MFI <= 12.4459 )
									ret := -0.435484
								if( MFI > 12.4459 )
									ret := 0.777778 // buy
							if( ema12 > -0.313413 )
								if( ema12 <= -0.201812 )
									ret := 0.203791
								if( ema12 > -0.201812 )
									ret := -0.091603
					if( Raw_Money_Flow > 1.08409e+07 )
						if( ema3 <= 150.218 )
							if( Money_Flow_Ratio <= 0.049795 )
								if( Positive_Money_Flow_Sum <= 522406 )
									ret := -0.800000 // sell
								if( Positive_Money_Flow_Sum > 522406 )
									ret := 0.000000
							if( Money_Flow_Ratio > 0.049795 )
								if( Raw_Money_Flow <= 1.29732e+07 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 1.29732e+07 )
									ret := -0.428571
						if( ema3 > 150.218 )
							ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 3.16154e+06 )
					if( ema2 <= 138.455 )
						if( Money_Flow_Ratio <= 1.80367 )
							if( Positive_Money_Flow_Sum <= 4.5246e+07 )
								if( Raw_Money_Flow <= 1.85749e+07 )
									ret := 0.147680
								if( Raw_Money_Flow > 1.85749e+07 )
									ret := 0.582524
							if( Positive_Money_Flow_Sum > 4.5246e+07 )
								if( ema13 <= 0.527314 )
									ret := 0.000000
								if( ema13 > 0.527314 )
									ret := -0.958333 // sell
						if( Money_Flow_Ratio > 1.80367 )
							if( ema3 <= 114.212 )
								if( Negative_Money_Flow_Sum <= 1.54863e+07 )
									ret := 0.413793
								if( Negative_Money_Flow_Sum > 1.54863e+07 )
									ret := 0.910714 // buy
							if( ema3 > 114.212 )
								if( MFI_Low <= 54.0247 )
									ret := 0.396355
								if( MFI_Low > 54.0247 )
									ret := 0.065217
					if( ema2 > 138.455 )
						if( Money_Flow_Ratio <= 1.02337 )
							if( Positive_Money_Flow_Sum <= 2.74497e+07 )
								if( Positive_Money_Flow_Sum <= 2.24734e+07 )
									ret := 0.088674
								if( Positive_Money_Flow_Sum > 2.24734e+07 )
									ret := -0.419847
							if( Positive_Money_Flow_Sum > 2.74497e+07 )
								if( Positive_Money_Flow_Sum <= 1.26709e+08 )
									ret := 0.474860
								if( Positive_Money_Flow_Sum > 1.26709e+08 )
									ret := -1.000000 // sell
						if( Money_Flow_Ratio > 1.02337 )
							if( Raw_Money_Flow <= 2.80124e+06 )
								if( tema <= 142.861 )
									ret := -0.277778
								if( tema > 142.861 )
									ret := 0.192308
							if( Raw_Money_Flow > 2.80124e+06 )
								if( Negative_Money_Flow_Sum <= 3.61699e+07 )
									ret := -0.509960
								if( Negative_Money_Flow_Sum > 3.61699e+07 )
									ret := 0.059406
	
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
float op_operation = decision_tree_0_SNOW_1Min_1220cb21(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, ema1, tema, ema12, ema2, ema3, ema13)

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


