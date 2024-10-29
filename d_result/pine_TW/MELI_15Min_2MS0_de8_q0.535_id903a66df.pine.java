//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: MELI_15Min_2MS0_903a66df Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MELI_15Min_2MS0_903a66df", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MELI_15Min_903a66df(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Typical_Price <= 1200.72 )
		if( smoothD_d <= 93.4392 )
			if( Positive_Money_Flow_Sum <= 6.67481e+07 )
				if( Positive_Money_Flow <= 2.52785e+07 )
					if( Typical_Price <= 340.674 )
						if( Positive_Money_Flow_Sum <= 1.81309e+06 )
							if( d_k <= 5.81554 )
								if( smoothK_k <= 39.7676 )
									ret := -1.000000 // sell
								if( smoothK_k > 39.7676 )
									ret := -0.750000 // sell
							if( d_k > 5.81554 )
								ret := 0.250000
						if( Positive_Money_Flow_Sum > 1.81309e+06 )
							if( Negative_Money_Flow_Sum <= 1.3827e+08 )
								if( MFI <= 10.4638 )
									ret := 0.541284
								if( MFI > 10.4638 )
									ret := 0.084662
							if( Negative_Money_Flow_Sum > 1.3827e+08 )
								if( d <= 1.88062 )
									ret := -0.641026
								if( d > 1.88062 )
									ret := -0.040462
					if( Typical_Price > 340.674 )
						if( MFI_High <= -60.8752 )
							if( Raw_Money_Flow <= 2.02272e+06 )
								if( d_k <= 4.47727 )
									ret := 0.481586
								if( d_k > 4.47727 )
									ret := -0.015152
							if( Raw_Money_Flow > 2.02272e+06 )
								if( rsi1 <= 37.9911 )
									ret := -0.017673
								if( rsi1 > 37.9911 )
									ret := 0.344023
						if( MFI_High > -60.8752 )
							if( Negative_Money_Flow_Sum <= 6.24237e+06 )
								if( MFI_Low <= 16.2193 )
									ret := 0.000000
								if( MFI_Low > 16.2193 )
									ret := 0.900000 // buy
							if( Negative_Money_Flow_Sum > 6.24237e+06 )
								if( smoothD_d <= 7.17716 )
									ret := -0.129305
								if( smoothD_d > 7.17716 )
									ret := 0.010772
				if( Positive_Money_Flow > 2.52785e+07 )
					if( Positive_Money_Flow_Sum <= 6.02048e+07 )
						if( d_k <= -0.008601 )
							if( smoothD_d <= 47.3355 )
								if( Typical_Price <= 343.937 )
									ret := 0.642857
								if( Typical_Price > 343.937 )
									ret := -0.340909
							if( smoothD_d > 47.3355 )
								if( smoothD_d <= 81.0675 )
									ret := -0.909091 // sell
								if( smoothD_d > 81.0675 )
									ret := -0.250000
						if( d_k > -0.008601 )
							if( Typical_Price <= 352.748 )
								if( MFI_Low <= 29.4763 )
									ret := -1.000000 // sell
								if( MFI_Low > 29.4763 )
									ret := 0.250000
							if( Typical_Price > 352.748 )
								if( MFI_High <= -67.1131 )
									ret := -0.600000
								if( MFI_High > -67.1131 )
									ret := 0.695652
					if( Positive_Money_Flow_Sum > 6.02048e+07 )
						if( d_k <= 8.20589 )
							if( d <= 11.5638 )
								if( rsi1 <= 43.6732 )
									ret := -0.972973 // sell
								if( rsi1 > 43.6732 )
									ret := -0.500000
							if( d > 11.5638 )
								if( Raw_Money_Flow <= 3.25487e+07 )
									ret := -0.863636 // sell
								if( Raw_Money_Flow > 3.25487e+07 )
									ret := -0.058824
						if( d_k > 8.20589 )
							ret := 0.500000
			if( Positive_Money_Flow_Sum > 6.67481e+07 )
				if( Positive_Money_Flow <= 3.6559e+06 )
					if( MFI <= 65.968 )
						if( Negative_Money_Flow_Sum <= 1.20599e+08 )
							if( Raw_Money_Flow <= 806008 )
								if( MFI_High <= -30.9706 )
									ret := 0.641892
								if( MFI_High > -30.9706 )
									ret := 0.261501
							if( Raw_Money_Flow > 806008 )
								if( Raw_Money_Flow <= 9.25313e+06 )
									ret := 0.047132
								if( Raw_Money_Flow > 9.25313e+06 )
									ret := 0.190058
						if( Negative_Money_Flow_Sum > 1.20599e+08 )
							if( rsi1 <= 76.0714 )
								if( Positive_Money_Flow_Sum <= 3.65426e+08 )
									ret := 0.026699
								if( Positive_Money_Flow_Sum > 3.65426e+08 )
									ret := 0.546875
							if( rsi1 > 76.0714 )
								if( Typical_Price <= 705.588 )
									ret := 0.750000 // buy
								if( Typical_Price > 705.588 )
									ret := -0.653061
					if( MFI > 65.968 )
						if( Money_Flow_Ratio <= 31.5453 )
							if( Negative_Money_Flow_Sum <= 9.4807e+06 )
								if( Positive_Money_Flow_Sum <= 8.7628e+07 )
									ret := 0.166667
								if( Positive_Money_Flow_Sum > 8.7628e+07 )
									ret := -0.941176 // sell
							if( Negative_Money_Flow_Sum > 9.4807e+06 )
								if( rsi1 <= 28.6635 )
									ret := 0.527027
								if( rsi1 > 28.6635 )
									ret := -0.008108
						if( Money_Flow_Ratio > 31.5453 )
							if( k <= 19.6272 )
								ret := 0.250000
							if( k > 19.6272 )
								if( MFI_Low <= 79.1972 )
									ret := 1.000000 // buy
								if( MFI_Low > 79.1972 )
									ret := 0.500000
				if( Positive_Money_Flow > 3.6559e+06 )
					if( Negative_Money_Flow_Sum <= 3.57634e+08 )
						if( Raw_Money_Flow <= 2.14546e+08 )
							if( MFI_Low <= -0.214284 )
								if( smoothK_k <= 79.4643 )
									ret := 0.939394 // buy
								if( smoothK_k > 79.4643 )
									ret := 0.166667
							if( MFI_Low > -0.214284 )
								if( MFI <= 33.0551 )
									ret := -0.030593
								if( MFI > 33.0551 )
									ret := 0.152227
						if( Raw_Money_Flow > 2.14546e+08 )
							if( rsi1 <= 52.8002 )
								ret := 0.600000
							if( rsi1 > 52.8002 )
								if( smoothK_k <= 29.4266 )
									ret := -0.750000 // sell
								if( smoothK_k > 29.4266 )
									ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 3.57634e+08 )
						if( Positive_Money_Flow <= 1.40534e+07 )
							if( Positive_Money_Flow_Sum <= 2.36577e+08 )
								if( MFI_High <= -57.6542 )
									ret := 1.000000 // buy
								if( MFI_High > -57.6542 )
									ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 2.36577e+08 )
								ret := -0.750000 // sell
						if( Positive_Money_Flow > 1.40534e+07 )
							if( Money_Flow_Ratio <= 0.383561 )
								if( Raw_Money_Flow <= 2.66326e+07 )
									ret := -0.142857
								if( Raw_Money_Flow > 2.66326e+07 )
									ret := -0.825397 // sell
							if( Money_Flow_Ratio > 0.383561 )
								if( rsi1 <= 22.1168 )
									ret := 0.875000 // buy
								if( rsi1 > 22.1168 )
									ret := -0.224490
		if( smoothD_d > 93.4392 )
			if( Negative_Money_Flow_Sum <= 2.04015e+07 )
				if( Positive_Money_Flow <= 1.32163e+07 )
					if( Positive_Money_Flow_Sum <= 2.34875e+08 )
						if( Raw_Money_Flow <= 5.87409e+06 )
							if( Positive_Money_Flow_Sum <= 8.9607e+07 )
								if( rsi1 <= 97.4099 )
									ret := 0.151899
								if( rsi1 > 97.4099 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 8.9607e+07 )
								if( Negative_Money_Flow_Sum <= 1.69591e+07 )
									ret := -0.454545
								if( Negative_Money_Flow_Sum > 1.69591e+07 )
									ret := 0.375000
						if( Raw_Money_Flow > 5.87409e+06 )
							if( Negative_Money_Flow_Sum <= 1.27414e+07 )
								if( Positive_Money_Flow_Sum <= 4.97382e+07 )
									ret := 0.894737 // buy
								if( Positive_Money_Flow_Sum > 4.97382e+07 )
									ret := 0.400000
							if( Negative_Money_Flow_Sum > 1.27414e+07 )
								if( Negative_Money_Flow_Sum <= 1.5029e+07 )
									ret := -0.461538
								if( Negative_Money_Flow_Sum > 1.5029e+07 )
									ret := 0.230769
					if( Positive_Money_Flow_Sum > 2.34875e+08 )
						if( Positive_Money_Flow <= 537298 )
							if( smoothD_d <= 95.3162 )
								ret := 0.750000 // buy
							if( smoothD_d > 95.3162 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow > 537298 )
							ret := 0.000000
				if( Positive_Money_Flow > 1.32163e+07 )
					if( Positive_Money_Flow_Sum <= 9.64517e+07 )
						if( MFI_High <= 2.77322 )
							ret := 0.166667
						if( MFI_High > 2.77322 )
							ret := 0.571429
					if( Positive_Money_Flow_Sum > 9.64517e+07 )
						if( Positive_Money_Flow_Sum <= 1.39105e+08 )
							if( Raw_Money_Flow <= 2.52816e+07 )
								if( smoothD_d <= 94.8878 )
									ret := -1.000000 // sell
								if( smoothD_d > 94.8878 )
									ret := -0.500000
							if( Raw_Money_Flow > 2.52816e+07 )
								ret := -0.428571
						if( Positive_Money_Flow_Sum > 1.39105e+08 )
							if( Negative_Money_Flow_Sum <= 1.51482e+07 )
								if( MFI <= 93.6156 )
									ret := -1.000000 // sell
								if( MFI > 93.6156 )
									ret := -0.214286
							if( Negative_Money_Flow_Sum > 1.51482e+07 )
								if( Typical_Price <= 874.57 )
									ret := 0.727273 // buy
								if( Typical_Price > 874.57 )
									ret := -0.250000
			if( Negative_Money_Flow_Sum > 2.04015e+07 )
				if( MFI_High <= -5.00717 )
					if( k <= 94.3126 )
						if( Money_Flow_Ratio <= 1.44805 )
							if( Positive_Money_Flow_Sum <= 3.05473e+07 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 3.05473e+07 )
								if( smoothK_k <= 90.7691 )
									ret := -0.217391
								if( smoothK_k > 90.7691 )
									ret := 0.384615
						if( Money_Flow_Ratio > 1.44805 )
							if( Typical_Price <= 558.557 )
								if( Negative_Money_Flow <= 7.65017e+06 )
									ret := 0.214286
								if( Negative_Money_Flow > 7.65017e+06 )
									ret := -0.750000 // sell
							if( Typical_Price > 558.557 )
								if( Negative_Money_Flow <= 2.11543e+07 )
									ret := 0.818182 // buy
								if( Negative_Money_Flow > 2.11543e+07 )
									ret := 0.375000
					if( k > 94.3126 )
						if( rsi1 <= 86.1389 )
							if( Positive_Money_Flow_Sum <= 1.34881e+08 )
								if( Positive_Money_Flow_Sum <= 3.08113e+07 )
									ret := -0.344828
								if( Positive_Money_Flow_Sum > 3.08113e+07 )
									ret := -0.023495
							if( Positive_Money_Flow_Sum > 1.34881e+08 )
								if( Negative_Money_Flow_Sum <= 1.47447e+08 )
									ret := -0.370130
								if( Negative_Money_Flow_Sum > 1.47447e+08 )
									ret := -0.039604
						if( rsi1 > 86.1389 )
							if( Raw_Money_Flow <= 2.36792e+06 )
								if( Positive_Money_Flow <= 45960.7 )
									ret := 0.250000
								if( Positive_Money_Flow > 45960.7 )
									ret := 0.923077 // buy
							if( Raw_Money_Flow > 2.36792e+06 )
								if( k <= 98.77 )
									ret := 0.526316
								if( k > 98.77 )
									ret := -0.075000
				if( MFI_High > -5.00717 )
					if( Positive_Money_Flow_Sum <= 3.99567e+08 )
						if( rsi1 <= 63.4504 )
							if( Typical_Price <= 420.082 )
								ret := -0.600000
							if( Typical_Price > 420.082 )
								if( Raw_Money_Flow <= 2.09409e+07 )
									ret := 0.058824
								if( Raw_Money_Flow > 2.09409e+07 )
									ret := 0.777778 // buy
						if( rsi1 > 63.4504 )
							if( rsi1 <= 94.7629 )
								if( Typical_Price <= 1167.53 )
									ret := -0.397933
								if( Typical_Price > 1167.53 )
									ret := 0.142857
							if( rsi1 > 94.7629 )
								if( Negative_Money_Flow <= 153346 )
									ret := 0.000000
								if( Negative_Money_Flow > 153346 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 3.99567e+08 )
						if( Typical_Price <= 973.688 )
							if( Positive_Money_Flow <= 360426 )
								if( d_k <= 1.15039 )
									ret := 0.500000
								if( d_k > 1.15039 )
									ret := 0.000000
							if( Positive_Money_Flow > 360426 )
								ret := 1.000000 // buy
						if( Typical_Price > 973.688 )
							if( rsi1 <= 83.5552 )
								if( Positive_Money_Flow <= 5.16344e+07 )
									ret := -0.600000
								if( Positive_Money_Flow > 5.16344e+07 )
									ret := 0.200000
							if( rsi1 > 83.5552 )
								if( Raw_Money_Flow <= 3.30141e+07 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 3.30141e+07 )
									ret := -0.200000
	if( Typical_Price > 1200.72 )
		if( Negative_Money_Flow_Sum <= 5.56704e+08 )
			if( Positive_Money_Flow <= 132840 )
				if( MFI_High <= -71.1754 )
					if( rsi1 <= 35.2573 )
						if( Negative_Money_Flow_Sum <= 8.1186e+07 )
							if( k <= 17.1463 )
								ret := -0.250000
							if( k > 17.1463 )
								ret := -0.750000 // sell
						if( Negative_Money_Flow_Sum > 8.1186e+07 )
							if( Positive_Money_Flow_Sum <= 2.36236e+07 )
								if( Positive_Money_Flow_Sum <= 1.9283e+07 )
									ret := 0.544304
								if( Positive_Money_Flow_Sum > 1.9283e+07 )
									ret := 0.047619
							if( Positive_Money_Flow_Sum > 2.36236e+07 )
								if( Raw_Money_Flow <= 3.78413e+07 )
									ret := 0.607143
								if( Raw_Money_Flow > 3.78413e+07 )
									ret := 1.000000 // buy
					if( rsi1 > 35.2573 )
						if( Raw_Money_Flow <= 1.18371e+08 )
							if( d_k <= -22.3696 )
								ret := -0.750000 // sell
							if( d_k > -22.3696 )
								if( Raw_Money_Flow <= 1.08005e+07 )
									ret := 0.307692
								if( Raw_Money_Flow > 1.08005e+07 )
									ret := -0.066667
						if( Raw_Money_Flow > 1.18371e+08 )
							ret := -0.800000 // sell
				if( MFI_High > -71.1754 )
					if( d_k <= 14.0061 )
						if( Money_Flow_Ratio <= 13.5437 )
							if( Positive_Money_Flow_Sum <= 6.3764e+08 )
								if( Negative_Money_Flow_Sum <= 4.42099e+08 )
									ret := 0.040920
								if( Negative_Money_Flow_Sum > 4.42099e+08 )
									ret := 0.265306
							if( Positive_Money_Flow_Sum > 6.3764e+08 )
								if( MFI_Low <= 62.551 )
									ret := 0.000000
								if( MFI_Low > 62.551 )
									ret := -0.774194 // sell
						if( Money_Flow_Ratio > 13.5437 )
							if( rsi1 <= 77.9133 )
								if( d_k <= -10.9756 )
									ret := -1.000000 // sell
								if( d_k > -10.9756 )
									ret := 0.852941 // buy
							if( rsi1 > 77.9133 )
								if( Negative_Money_Flow <= 5.39358e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 5.39358e+06 )
									ret := 0.000000
					if( d_k > 14.0061 )
						if( Positive_Money_Flow_Sum <= 2.18966e+08 )
							if( Raw_Money_Flow <= 2.74279e+06 )
								if( rsi1 <= 25.0932 )
									ret := 0.944444 // buy
								if( rsi1 > 25.0932 )
									ret := 0.191667
							if( Raw_Money_Flow > 2.74279e+06 )
								if( Negative_Money_Flow_Sum <= 2.36433e+08 )
									ret := 0.002558
								if( Negative_Money_Flow_Sum > 2.36433e+08 )
									ret := -0.450000
						if( Positive_Money_Flow_Sum > 2.18966e+08 )
							if( Negative_Money_Flow <= 2.35159e+06 )
								if( d_k <= 15.1774 )
									ret := 0.250000
								if( d_k > 15.1774 )
									ret := -0.888889 // sell
							if( Negative_Money_Flow > 2.35159e+06 )
								if( Positive_Money_Flow_Sum <= 2.47945e+08 )
									ret := -0.493976
								if( Positive_Money_Flow_Sum > 2.47945e+08 )
									ret := -0.073529
			if( Positive_Money_Flow > 132840 )
				if( rsi1 <= 38.0618 )
					if( Negative_Money_Flow_Sum <= 2.62943e+08 )
						if( Positive_Money_Flow_Sum <= 2.50646e+08 )
							if( Negative_Money_Flow_Sum <= 1.70673e+08 )
								if( smoothD_d <= 5.55277 )
									ret := -0.027322
								if( smoothD_d > 5.55277 )
									ret := -0.243644
							if( Negative_Money_Flow_Sum > 1.70673e+08 )
								if( d <= 26.5241 )
									ret := 0.152318
								if( d > 26.5241 )
									ret := -0.125000
						if( Positive_Money_Flow_Sum > 2.50646e+08 )
							if( Negative_Money_Flow_Sum <= 2.0509e+08 )
								if( rsi1 <= 25.9838 )
									ret := 0.769231 // buy
								if( rsi1 > 25.9838 )
									ret := -0.052632
							if( Negative_Money_Flow_Sum > 2.0509e+08 )
								if( Raw_Money_Flow <= 2.96656e+07 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 2.96656e+07 )
									ret := 0.500000
					if( Negative_Money_Flow_Sum > 2.62943e+08 )
						if( Positive_Money_Flow <= 6.83871e+07 )
							if( Negative_Money_Flow_Sum <= 4.70443e+08 )
								if( Typical_Price <= 1874.5 )
									ret := -0.407407
								if( Typical_Price > 1874.5 )
									ret := 0.190476
							if( Negative_Money_Flow_Sum > 4.70443e+08 )
								if( Raw_Money_Flow <= 2.72649e+07 )
									ret := 0.608696
								if( Raw_Money_Flow > 2.72649e+07 )
									ret := -0.500000
						if( Positive_Money_Flow > 6.83871e+07 )
							if( rsi1 <= 32.3484 )
								if( Typical_Price <= 1577.92 )
									ret := 0.714286 // buy
								if( Typical_Price > 1577.92 )
									ret := 0.166667
							if( rsi1 > 32.3484 )
								if( Positive_Money_Flow <= 8.50064e+07 )
									ret := -0.750000 // sell
								if( Positive_Money_Flow > 8.50064e+07 )
									ret := 0.000000
				if( rsi1 > 38.0618 )
					if( Positive_Money_Flow_Sum <= 1.7161e+08 )
						if( Raw_Money_Flow <= 1.39358e+07 )
							if( k <= 38.1188 )
								if( Positive_Money_Flow_Sum <= 1.68411e+08 )
									ret := -0.056492
								if( Positive_Money_Flow_Sum > 1.68411e+08 )
									ret := -0.769231 // sell
							if( k > 38.1188 )
								if( Positive_Money_Flow_Sum <= 9.8472e+07 )
									ret := 0.013136
								if( Positive_Money_Flow_Sum > 9.8472e+07 )
									ret := 0.107486
						if( Raw_Money_Flow > 1.39358e+07 )
							if( rsi1 <= 60.3762 )
								if( Negative_Money_Flow_Sum <= 4.12715e+08 )
									ret := 0.185517
								if( Negative_Money_Flow_Sum > 4.12715e+08 )
									ret := -0.500000
							if( rsi1 > 60.3762 )
								if( k <= 55.8225 )
									ret := -0.197279
								if( k > 55.8225 )
									ret := 0.088283
					if( Positive_Money_Flow_Sum > 1.7161e+08 )
						if( Negative_Money_Flow_Sum <= 2.15461e+07 )
							if( d_k <= -1.64764 )
								if( d_k <= -15.3382 )
									ret := -0.272727
								if( d_k > -15.3382 )
									ret := 0.545455
							if( d_k > -1.64764 )
								if( MFI <= 93.1739 )
									ret := 0.733333 // buy
								if( MFI > 93.1739 )
									ret := -0.209302
						if( Negative_Money_Flow_Sum > 2.15461e+07 )
							if( Positive_Money_Flow_Sum <= 9.4569e+08 )
								if( smoothK_k <= 66.7565 )
									ret := -0.028260
								if( smoothK_k > 66.7565 )
									ret := -0.132122
							if( Positive_Money_Flow_Sum > 9.4569e+08 )
								ret := -1.000000 // sell
		if( Negative_Money_Flow_Sum > 5.56704e+08 )
			if( d_k <= -17.2484 )
				if( MFI_High <= -44.9502 )
					ret := -0.500000
				if( MFI_High > -44.9502 )
					ret := -1.000000 // sell
			if( d_k > -17.2484 )
				if( Negative_Money_Flow_Sum <= 7.87148e+08 )
					if( Positive_Money_Flow <= 2.37659e+07 )
						if( smoothK_k <= 16.3244 )
							if( rsi1 <= 7.8209 )
								ret := 0.857143 // buy
							if( rsi1 > 7.8209 )
								if( Negative_Money_Flow <= 9.2601e+07 )
									ret := 0.000000
								if( Negative_Money_Flow > 9.2601e+07 )
									ret := -0.777778 // sell
						if( smoothK_k > 16.3244 )
							if( Typical_Price <= 1256.37 )
								ret := 1.000000 // buy
							if( Typical_Price > 1256.37 )
								if( Raw_Money_Flow <= 1.60979e+08 )
									ret := 0.183333
								if( Raw_Money_Flow > 1.60979e+08 )
									ret := 1.000000 // buy
					if( Positive_Money_Flow > 2.37659e+07 )
						if( MFI_Low <= 10.7993 )
							if( d <= 46.5231 )
								if( Negative_Money_Flow_Sum <= 7.23422e+08 )
									ret := 0.969697 // buy
								if( Negative_Money_Flow_Sum > 7.23422e+08 )
									ret := 0.400000
							if( d > 46.5231 )
								ret := 0.000000
						if( MFI_Low > 10.7993 )
							if( MFI_Low <= 14.147 )
								ret := -1.000000 // sell
							if( MFI_Low > 14.147 )
								if( rsi1 <= 47.2961 )
									ret := 0.000000
								if( rsi1 > 47.2961 )
									ret := 0.909091 // buy
				if( Negative_Money_Flow_Sum > 7.87148e+08 )
					if( d_k <= -5.08696 )
						ret := 0.142857
					if( d_k > -5.08696 )
						if( d <= 15.1061 )
							ret := 1.000000 // buy
						if( d > 15.1061 )
							if( Negative_Money_Flow_Sum <= 8.73372e+08 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 8.73372e+08 )
								ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_MELI_15Min_903a66df(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


