//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: LYFT_15Min_2MV0_36ba23b7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_15Min_2MV0_36ba23b7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_15Min_36ba23b7(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( VIP <= 1.47041 )
		if( Negative_Money_Flow_Sum <= 3.55323e+08 )
			if( Typical_Price <= 13.5444 )
				if( Positive_Money_Flow_Sum <= 551895 )
					if( VIP_VIM <= 0.000185 )
						if( VIP <= 1.12642 )
							if( Positive_Money_Flow <= 93556.5 )
								if( Positive_Money_Flow_Sum <= 130346 )
									ret := -0.076433
								if( Positive_Money_Flow_Sum > 130346 )
									ret := 0.248262
							if( Positive_Money_Flow > 93556.5 )
								if( Raw_Money_Flow <= 266502 )
									ret := -0.384615
								if( Raw_Money_Flow > 266502 )
									ret := 0.666667
						if( VIP > 1.12642 )
							if( VIP_VIM <= -0.252453 )
								if( Negative_Money_Flow_Sum <= 446395 )
									ret := 0.536585
								if( Negative_Money_Flow_Sum > 446395 )
									ret := 0.250000
							if( VIP_VIM > -0.252453 )
								if( VIP <= 1.30251 )
									ret := 0.311927
								if( VIP > 1.30251 )
									ret := 0.075000
					if( VIP_VIM > 0.000185 )
						if( Money_Flow_Ratio <= 1.25377 )
							if( Money_Flow_Ratio <= 1.05976 )
								if( Negative_Money_Flow <= 20321.2 )
									ret := -0.012658
								if( Negative_Money_Flow > 20321.2 )
									ret := 0.269608
							if( Money_Flow_Ratio > 1.05976 )
								if( VIP <= 1.40809 )
									ret := -0.506329
								if( VIP > 1.40809 )
									ret := 0.000000
						if( Money_Flow_Ratio > 1.25377 )
							if( Negative_Money_Flow <= 61.0754 )
								if( MFI_High <= -22.2263 )
									ret := 0.592593
								if( MFI_High > -22.2263 )
									ret := -0.092683
							if( Negative_Money_Flow > 61.0754 )
								if( Positive_Money_Flow_Sum <= 501761 )
									ret := 0.646552
								if( Positive_Money_Flow_Sum > 501761 )
									ret := 0.160000
				if( Positive_Money_Flow_Sum > 551895 )
					if( Raw_Money_Flow <= 3.27133e+06 )
						if( Positive_Money_Flow_Sum <= 859268 )
							if( Raw_Money_Flow <= 309121 )
								if( Negative_Money_Flow_Sum <= 96731.4 )
									ret := 0.447368
								if( Negative_Money_Flow_Sum > 96731.4 )
									ret := -0.155660
							if( Raw_Money_Flow > 309121 )
								if( VIP <= 0.865251 )
									ret := -0.758621 // sell
								if( VIP > 0.865251 )
									ret := -0.253968
						if( Positive_Money_Flow_Sum > 859268 )
							if( Raw_Money_Flow <= 1.73014e+06 )
								if( VIP <= 1.0701 )
									ret := 0.093350
								if( VIP > 1.0701 )
									ret := -0.010021
							if( Raw_Money_Flow > 1.73014e+06 )
								if( Negative_Money_Flow_Sum <= 4.21613e+07 )
									ret := -0.065190
								if( Negative_Money_Flow_Sum > 4.21613e+07 )
									ret := 0.224359
					if( Raw_Money_Flow > 3.27133e+06 )
						if( MFI <= 46.4307 )
							if( VIP_VIM <= -0.645378 )
								if( MFI_High <= -68.7298 )
									ret := -0.488372
								if( MFI_High > -68.7298 )
									ret := -0.223256
							if( VIP_VIM > -0.645378 )
								if( MFI_High <= -34.8178 )
									ret := 0.019417
								if( MFI_High > -34.8178 )
									ret := -0.325926
						if( MFI > 46.4307 )
							if( Positive_Money_Flow_Sum <= 8.63008e+07 )
								if( Negative_Money_Flow <= 6.85815e+06 )
									ret := 0.156532
								if( Negative_Money_Flow > 6.85815e+06 )
									ret := -0.061584
							if( Positive_Money_Flow_Sum > 8.63008e+07 )
								if( Negative_Money_Flow_Sum <= 3.66196e+07 )
									ret := 0.062500
								if( Negative_Money_Flow_Sum > 3.66196e+07 )
									ret := -0.409483
			if( Typical_Price > 13.5444 )
				if( Negative_Money_Flow <= 1.94462e+07 )
					if( MFI_High <= -71.7104 )
						if( Negative_Money_Flow_Sum <= 695119 )
							if( Positive_Money_Flow_Sum <= 41099.1 )
								ret := 0.909091 // buy
							if( Positive_Money_Flow_Sum > 41099.1 )
								ret := 0.444444
						if( Negative_Money_Flow_Sum > 695119 )
							if( VIP_VIM <= -0.177605 )
								if( Raw_Money_Flow <= 97483.5 )
									ret := 0.071135
								if( Raw_Money_Flow > 97483.5 )
									ret := -0.258320
							if( VIP_VIM > -0.177605 )
								if( VIP <= 0.990999 )
									ret := 0.381818
								if( VIP > 0.990999 )
									ret := 0.007009
					if( MFI_High > -71.7104 )
						if( MFI <= 25.2675 )
							if( Negative_Money_Flow_Sum <= 7.47399e+07 )
								if( Negative_Money_Flow <= 3.82694e+06 )
									ret := 0.045060
								if( Negative_Money_Flow > 3.82694e+06 )
									ret := -0.079760
							if( Negative_Money_Flow_Sum > 7.47399e+07 )
								if( Raw_Money_Flow <= 11320.8 )
									ret := 0.495413
								if( Raw_Money_Flow > 11320.8 )
									ret := 0.154729
						if( MFI > 25.2675 )
							if( Raw_Money_Flow <= 1.15233e+07 )
								if( VIP <= 0.873649 )
									ret := 0.068812
								if( VIP > 0.873649 )
									ret := -0.005329
							if( Raw_Money_Flow > 1.15233e+07 )
								if( MFI_High <= 18.9269 )
									ret := -0.069649
								if( MFI_High > 18.9269 )
									ret := 0.283537
				if( Negative_Money_Flow > 1.94462e+07 )
					if( MFI_High <= -48.916 )
						if( Negative_Money_Flow <= 6.97814e+07 )
							if( MFI_Low <= -19.1816 )
								if( VIP <= 0.650338 )
									ret := 0.738636 // buy
								if( VIP > 0.650338 )
									ret := 0.111111
							if( MFI_Low > -19.1816 )
								if( Typical_Price <= 31.976 )
									ret := 0.033248
								if( Typical_Price > 31.976 )
									ret := 0.301818
						if( Negative_Money_Flow > 6.97814e+07 )
							if( VIP_VIM <= 0.100873 )
								if( Typical_Price <= 48.7529 )
									ret := 0.000000
								if( Typical_Price > 48.7529 )
									ret := -0.931034 // sell
							if( VIP_VIM > 0.100873 )
								ret := 0.875000 // buy
					if( MFI_High > -48.916 )
						if( VIP <= 0.915671 )
							if( MFI <= 53.3443 )
								if( Positive_Money_Flow_Sum <= 8.16985e+07 )
									ret := -0.231884
								if( Positive_Money_Flow_Sum > 8.16985e+07 )
									ret := -0.720000 // sell
							if( MFI > 53.3443 )
								if( VIP_VIM <= -0.151482 )
									ret := 0.695652
								if( VIP_VIM > -0.151482 )
									ret := -0.500000
						if( VIP > 0.915671 )
							if( VIP <= 1.22696 )
								if( VIP_VIM <= 0.010076 )
									ret := -0.063559
								if( VIP_VIM > 0.010076 )
									ret := 0.234513
							if( VIP > 1.22696 )
								if( Typical_Price <= 37.0978 )
									ret := -0.641509
								if( Typical_Price > 37.0978 )
									ret := -0.171429
		if( Negative_Money_Flow_Sum > 3.55323e+08 )
			if( VIM <= 1.33004 )
				if( Negative_Money_Flow <= 5.37549e+07 )
					if( Negative_Money_Flow <= 2.24624e+07 )
						if( Raw_Money_Flow <= 6.22224e+07 )
							if( Positive_Money_Flow_Sum <= 1.24745e+08 )
								if( Money_Flow_Ratio <= 0.269578 )
									ret := -0.681319
								if( Money_Flow_Ratio > 0.269578 )
									ret := 0.470588
							if( Positive_Money_Flow_Sum > 1.24745e+08 )
								if( Positive_Money_Flow_Sum <= 4.65031e+08 )
									ret := -0.847368 // sell
								if( Positive_Money_Flow_Sum > 4.65031e+08 )
									ret := -0.235294
						if( Raw_Money_Flow > 6.22224e+07 )
							if( MFI <= 27.0517 )
								if( VIP_VIM <= -0.590083 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.590083 )
									ret := -0.615385
							if( MFI > 27.0517 )
								if( Negative_Money_Flow_Sum <= 4.59058e+08 )
									ret := 0.090909
								if( Negative_Money_Flow_Sum > 4.59058e+08 )
									ret := 0.733333 // buy
					if( Negative_Money_Flow > 2.24624e+07 )
						if( VIP <= 0.859777 )
							if( Negative_Money_Flow <= 3.57824e+07 )
								ret := -0.222222
							if( Negative_Money_Flow > 3.57824e+07 )
								if( MFI_Low <= 7.94536 )
									ret := -0.666667
								if( MFI_Low > 7.94536 )
									ret := -1.000000 // sell
						if( VIP > 0.859777 )
							ret := 0.687500
				if( Negative_Money_Flow > 5.37549e+07 )
					if( MFI_High <= -57.1638 )
						if( Negative_Money_Flow <= 7.36241e+07 )
							ret := 0.000000
						if( Negative_Money_Flow > 7.36241e+07 )
							ret := 0.187500
					if( MFI_High > -57.1638 )
						ret := 0.750000 // buy
			if( VIM > 1.33004 )
				if( Negative_Money_Flow <= 3.4829e+07 )
					if( Positive_Money_Flow <= 65638.1 )
						if( VIM <= 1.36194 )
							ret := -0.250000
						if( VIM > 1.36194 )
							ret := -0.923077 // sell
					if( Positive_Money_Flow > 65638.1 )
						if( Money_Flow_Ratio <= 0.2691 )
							ret := -0.058824
						if( Money_Flow_Ratio > 0.2691 )
							ret := 0.500000
				if( Negative_Money_Flow > 3.4829e+07 )
					if( Typical_Price <= 55.9421 )
						if( Negative_Money_Flow <= 5.29026e+07 )
							ret := 1.000000 // buy
						if( Negative_Money_Flow > 5.29026e+07 )
							ret := 0.666667
					if( Typical_Price > 55.9421 )
						ret := -0.333333
	if( VIP > 1.47041 )
		if( Negative_Money_Flow <= 3.31155 )
			if( MFI <= 56.6291 )
				if( MFI_Low <= 7.84067 )
					if( Negative_Money_Flow_Sum <= 3.82588e+06 )
						if( Raw_Money_Flow <= 18175.8 )
							if( Positive_Money_Flow_Sum <= 255937 )
								if( Negative_Money_Flow_Sum <= 575810 )
									ret := 0.081633
								if( Negative_Money_Flow_Sum > 575810 )
									ret := -0.538462
							if( Positive_Money_Flow_Sum > 255937 )
								ret := 0.666667
						if( Raw_Money_Flow > 18175.8 )
							if( MFI_High <= -66.2528 )
								ret := -0.611111
							if( MFI_High > -66.2528 )
								if( Typical_Price <= 14.6643 )
									ret := -0.218750
								if( Typical_Price > 14.6643 )
									ret := 0.634615
					if( Negative_Money_Flow_Sum > 3.82588e+06 )
						if( MFI <= 4.89449 )
							if( MFI_Low <= -17.7374 )
								if( VIP_VIM <= -0.736594 )
									ret := 0.388889
								if( VIP_VIM > -0.736594 )
									ret := -0.211111
							if( MFI_Low > -17.7374 )
								if( Raw_Money_Flow <= 47467.2 )
									ret := -0.071429
								if( Raw_Money_Flow > 47467.2 )
									ret := 0.312500
						if( MFI > 4.89449 )
							if( VIP_VIM <= 0.127142 )
								if( Typical_Price <= 42.9273 )
									ret := -0.500000
								if( Typical_Price > 42.9273 )
									ret := -0.216667
							if( VIP_VIM > 0.127142 )
								if( VIP <= 1.65644 )
									ret := -0.535714
								if( VIP > 1.65644 )
									ret := -0.833333 // sell
				if( MFI_Low > 7.84067 )
					if( Positive_Money_Flow <= 93353.7 )
						if( Money_Flow_Ratio <= 1.03096 )
							if( Typical_Price <= 10.9177 )
								if( VIM <= 1.48248 )
									ret := 0.391304
								if( VIM > 1.48248 )
									ret := -0.137500
							if( Typical_Price > 10.9177 )
								if( Positive_Money_Flow <= 534.557 )
									ret := 0.069767
								if( Positive_Money_Flow > 534.557 )
									ret := -0.490956
						if( Money_Flow_Ratio > 1.03096 )
							if( MFI_High <= -24.9001 )
								if( VIM <= 1.43944 )
									ret := -0.458333
								if( VIM > 1.43944 )
									ret := 0.276596
							if( MFI_High > -24.9001 )
								if( Typical_Price <= 33.4339 )
									ret := -0.380952
								if( Typical_Price > 33.4339 )
									ret := -0.800000 // sell
					if( Positive_Money_Flow > 93353.7 )
						if( VIP <= 1.53508 )
							if( Positive_Money_Flow <= 215300 )
								if( Money_Flow_Ratio <= 1.11336 )
									ret := 0.787879 // buy
								if( Money_Flow_Ratio > 1.11336 )
									ret := -0.125000
							if( Positive_Money_Flow > 215300 )
								if( Positive_Money_Flow_Sum <= 1.04142e+06 )
									ret := 0.692308
								if( Positive_Money_Flow_Sum > 1.04142e+06 )
									ret := -0.129032
						if( VIP > 1.53508 )
							if( MFI <= 42.4722 )
								if( MFI_Low <= 18.5815 )
									ret := -0.306667
								if( MFI_Low > 18.5815 )
									ret := 0.550000
							if( MFI > 42.4722 )
								if( Positive_Money_Flow_Sum <= 3.71135e+07 )
									ret := -0.361868
								if( Positive_Money_Flow_Sum > 3.71135e+07 )
									ret := 0.480000
			if( MFI > 56.6291 )
				if( Negative_Money_Flow_Sum <= 46475.1 )
					if( Positive_Money_Flow_Sum <= 159834 )
						if( MFI <= 75.8293 )
							if( VIP_VIM <= 0.487572 )
								ret := 0.750000 // buy
							if( VIP_VIM > 0.487572 )
								ret := 1.000000 // buy
						if( MFI > 75.8293 )
							ret := 0.307692
					if( Positive_Money_Flow_Sum > 159834 )
						if( Money_Flow_Ratio <= 9.21879 )
							if( Positive_Money_Flow_Sum <= 316699 )
								ret := -0.454545
							if( Positive_Money_Flow_Sum > 316699 )
								ret := -0.909091 // sell
						if( Money_Flow_Ratio > 9.21879 )
							if( VIM <= 1.92772 )
								if( VIP <= 1.8761 )
									ret := 0.205882
								if( VIP > 1.8761 )
									ret := -0.350000
							if( VIM > 1.92772 )
								if( Money_Flow_Ratio <= 18.0838 )
									ret := 0.875000 // buy
								if( Money_Flow_Ratio > 18.0838 )
									ret := 0.333333
				if( Negative_Money_Flow_Sum > 46475.1 )
					if( Positive_Money_Flow_Sum <= 2.60992e+07 )
						if( Positive_Money_Flow_Sum <= 4.74155e+06 )
							if( Positive_Money_Flow_Sum <= 2.48379e+06 )
								if( VIP_VIM <= 0.280945 )
									ret := -0.055021
								if( VIP_VIM > 0.280945 )
									ret := -0.205709
							if( Positive_Money_Flow_Sum > 2.48379e+06 )
								if( Positive_Money_Flow <= 111238 )
									ret := -0.500000
								if( Positive_Money_Flow > 111238 )
									ret := 0.524752
						if( Positive_Money_Flow_Sum > 4.74155e+06 )
							if( Positive_Money_Flow_Sum <= 1.39793e+07 )
								if( Typical_Price <= 56.3719 )
									ret := -0.687500
								if( Typical_Price > 56.3719 )
									ret := -0.133333
							if( Positive_Money_Flow_Sum > 1.39793e+07 )
								if( Raw_Money_Flow <= 152378 )
									ret := 0.250000
								if( Raw_Money_Flow > 152378 )
									ret := -0.406504
					if( Positive_Money_Flow_Sum > 2.60992e+07 )
						if( Negative_Money_Flow_Sum <= 6.55944e+06 )
							if( MFI_High <= 19.7764 )
								if( Negative_Money_Flow_Sum <= 4.98022e+06 )
									ret := 0.064145
								if( Negative_Money_Flow_Sum > 4.98022e+06 )
									ret := 0.392405
							if( MFI_High > 19.7764 )
								if( VIM <= 1.53344 )
									ret := -0.426471
								if( VIM > 1.53344 )
									ret := 0.375000
						if( Negative_Money_Flow_Sum > 6.55944e+06 )
							if( Raw_Money_Flow <= 162385 )
								if( MFI <= 64.6137 )
									ret := 0.629630
								if( MFI > 64.6137 )
									ret := -0.017794
							if( Raw_Money_Flow > 162385 )
								if( VIM <= 0.938766 )
									ret := -0.064103
								if( VIM > 0.938766 )
									ret := -0.615894
		if( Negative_Money_Flow > 3.31155 )
			if( Negative_Money_Flow <= 213708 )
				if( Positive_Money_Flow_Sum <= 5.4259e+07 )
					if( VIM <= 8.16742 )
						if( Typical_Price <= 27.37 )
							if( Money_Flow_Ratio <= 0.396541 )
								if( Money_Flow_Ratio <= 0.160475 )
									ret := -0.150000
								if( Money_Flow_Ratio > 0.160475 )
									ret := 0.522059
							if( Money_Flow_Ratio > 0.396541 )
								if( Negative_Money_Flow <= 2019.96 )
									ret := 0.309645
								if( Negative_Money_Flow > 2019.96 )
									ret := 0.011472
						if( Typical_Price > 27.37 )
							if( MFI_Low <= 46.9898 )
								if( MFI_High <= -33.7269 )
									ret := 0.009839
								if( MFI_High > -33.7269 )
									ret := -0.319626
							if( MFI_Low > 46.9898 )
								if( MFI_High <= -5.91954 )
									ret := 0.404372
								if( MFI_High > -5.91954 )
									ret := -0.021322
					if( VIM > 8.16742 )
						if( Typical_Price <= 57.6448 )
							if( VIP_VIM <= 0.252966 )
								if( VIM <= 9.66058 )
									ret := -0.900000 // sell
								if( VIM > 9.66058 )
									ret := -1.000000 // sell
							if( VIP_VIM > 0.252966 )
								ret := -0.700000 // sell
						if( Typical_Price > 57.6448 )
							ret := -0.250000
				if( Positive_Money_Flow_Sum > 5.4259e+07 )
					if( MFI_High <= 0.38461 )
						if( Typical_Price <= 36.1604 )
							ret := 0.052632
						if( Typical_Price > 36.1604 )
							if( Raw_Money_Flow <= 28501.8 )
								if( Positive_Money_Flow_Sum <= 9.46449e+07 )
									ret := 0.893333 // buy
								if( Positive_Money_Flow_Sum > 9.46449e+07 )
									ret := 0.307692
							if( Raw_Money_Flow > 28501.8 )
								if( Positive_Money_Flow <= 265.604 )
									ret := 0.090909
								if( Positive_Money_Flow > 265.604 )
									ret := 0.793103 // buy
					if( MFI_High > 0.38461 )
						if( Positive_Money_Flow_Sum <= 1.14548e+08 )
							if( Typical_Price <= 18.8825 )
								ret := -0.500000
							if( Typical_Price > 18.8825 )
								if( Typical_Price <= 42.9785 )
									ret := 0.618056
								if( Typical_Price > 42.9785 )
									ret := 0.061069
						if( Positive_Money_Flow_Sum > 1.14548e+08 )
							if( MFI <= 91.1398 )
								ret := -1.000000 // sell
							if( MFI > 91.1398 )
								if( VIM <= 0.934314 )
									ret := 0.500000
								if( VIM > 0.934314 )
									ret := -0.065574
			if( Negative_Money_Flow > 213708 )
				if( VIP <= 2.48462 )
					if( Positive_Money_Flow_Sum <= 197055 )
						if( Positive_Money_Flow_Sum <= 117966 )
							if( Money_Flow_Ratio <= 0.040431 )
								ret := 0.250000
							if( Money_Flow_Ratio > 0.040431 )
								if( MFI_High <= -68.0822 )
									ret := -0.692308
								if( MFI_High > -68.0822 )
									ret := -0.076923
						if( Positive_Money_Flow_Sum > 117966 )
							if( MFI_High <= -68.5355 )
								ret := -0.363636
							if( MFI_High > -68.5355 )
								if( Raw_Money_Flow <= 316454 )
									ret := -0.906250 // sell
								if( Raw_Money_Flow > 316454 )
									ret := -0.636364
					if( Positive_Money_Flow_Sum > 197055 )
						if( MFI_Low <= 59.175 )
							if( VIM <= 2.00343 )
								if( MFI <= 28.819 )
									ret := 0.393258
								if( MFI > 28.819 )
									ret := -0.030848
							if( VIM > 2.00343 )
								if( Positive_Money_Flow_Sum <= 2.07399e+07 )
									ret := -0.482143
								if( Positive_Money_Flow_Sum > 2.07399e+07 )
									ret := 0.714286 // buy
						if( MFI_Low > 59.175 )
							if( Negative_Money_Flow_Sum <= 1.31561e+07 )
								if( Positive_Money_Flow_Sum <= 2.93846e+06 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 2.93846e+06 )
									ret := 0.038835
							if( Negative_Money_Flow_Sum > 1.31561e+07 )
								if( Negative_Money_Flow_Sum <= 2.0777e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 2.0777e+07 )
									ret := -0.666667
				if( VIP > 2.48462 )
					if( Negative_Money_Flow_Sum <= 1.82035e+07 )
						if( Typical_Price <= 40.794 )
							ret := -0.923077 // sell
						if( Typical_Price > 40.794 )
							if( Typical_Price <= 58.6048 )
								if( MFI_High <= -46.8824 )
									ret := -0.363636
								if( MFI_High > -46.8824 )
									ret := -0.222222
							if( Typical_Price > 58.6048 )
								ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 1.82035e+07 )
						ret := 0.200000
	
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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_LYFT_15Min_36ba23b7(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)

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


