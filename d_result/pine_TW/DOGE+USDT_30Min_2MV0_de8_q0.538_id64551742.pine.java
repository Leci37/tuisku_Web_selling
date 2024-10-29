//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: DOGEUSDT_30Min_2MV0_64551742 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_30Min_2MV0_64551742", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_30Min_64551742(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( VIP <= 0.88877 )
		if( Raw_Money_Flow <= 5.23106e+06 )
			if( Typical_Price <= 0.057611 )
				if( Raw_Money_Flow <= 240907 )
					if( VIP_VIM <= -0.560677 )
						if( Negative_Money_Flow_Sum <= 318438 )
							if( Positive_Money_Flow <= 186.892 )
								if( Money_Flow_Ratio <= 0.150099 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.150099 )
									ret := 0.500000
							if( Positive_Money_Flow > 186.892 )
								ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 318438 )
							if( Raw_Money_Flow <= 151793 )
								if( VIP <= 0.696418 )
									ret := 0.000000
								if( VIP > 0.696418 )
									ret := 0.750000 // buy
							if( Raw_Money_Flow > 151793 )
								ret := 1.000000 // buy
					if( VIP_VIM > -0.560677 )
						if( Negative_Money_Flow <= 136594 )
							if( Negative_Money_Flow_Sum <= 697014 )
								if( MFI_Low <= 6.13005 )
									ret := 0.337302
								if( MFI_Low > 6.13005 )
									ret := -0.034946
							if( Negative_Money_Flow_Sum > 697014 )
								if( Negative_Money_Flow_Sum <= 3.65119e+06 )
									ret := -0.186207
								if( Negative_Money_Flow_Sum > 3.65119e+06 )
									ret := 0.666667
						if( Negative_Money_Flow > 136594 )
							if( VIP_VIM <= -0.371917 )
								if( VIM <= 1.22458 )
									ret := -0.545455
								if( VIM > 1.22458 )
									ret := 0.875000 // buy
							if( VIP_VIM > -0.371917 )
								if( MFI <= 31.3829 )
									ret := 0.750000 // buy
								if( MFI > 31.3829 )
									ret := 0.090909
				if( Raw_Money_Flow > 240907 )
					if( Negative_Money_Flow_Sum <= 4.34006e+06 )
						if( Negative_Money_Flow_Sum <= 2.54201e+06 )
							if( Negative_Money_Flow_Sum <= 1.96193e+06 )
								if( Typical_Price <= 0.008446 )
									ret := 0.622222
								if( Typical_Price > 0.008446 )
									ret := -0.500000
							if( Negative_Money_Flow_Sum > 1.96193e+06 )
								if( Raw_Money_Flow <= 331243 )
									ret := -0.857143 // sell
								if( Raw_Money_Flow > 331243 )
									ret := -0.125000
						if( Negative_Money_Flow_Sum > 2.54201e+06 )
							if( Negative_Money_Flow_Sum <= 3.75866e+06 )
								if( MFI <= 22.2664 )
									ret := 0.142857
								if( MFI > 22.2664 )
									ret := 0.803279 // buy
							if( Negative_Money_Flow_Sum > 3.75866e+06 )
								if( MFI <= 39.1735 )
									ret := 0.980000 // buy
								if( MFI > 39.1735 )
									ret := 0.666667
					if( Negative_Money_Flow_Sum > 4.34006e+06 )
						if( Negative_Money_Flow_Sum <= 7.48851e+06 )
							if( Money_Flow_Ratio <= 0.330617 )
								if( VIP <= 0.803613 )
									ret := -0.750000 // sell
								if( VIP > 0.803613 )
									ret := -1.000000 // sell
							if( Money_Flow_Ratio > 0.330617 )
								if( Positive_Money_Flow_Sum <= 2.14104e+06 )
									ret := 0.857143 // buy
								if( Positive_Money_Flow_Sum > 2.14104e+06 )
									ret := -0.196429
						if( Negative_Money_Flow_Sum > 7.48851e+06 )
							if( Positive_Money_Flow <= 916280 )
								if( Typical_Price <= 0.051313 )
									ret := 0.675676
								if( Typical_Price > 0.051313 )
									ret := 0.311558
							if( Positive_Money_Flow > 916280 )
								if( MFI <= 33.998 )
									ret := 0.288136
								if( MFI > 33.998 )
									ret := -0.142857
			if( Typical_Price > 0.057611 )
				if( Negative_Money_Flow_Sum <= 8.9999e+06 )
					if( MFI_Low <= 0.054178 )
						if( Negative_Money_Flow <= 1.48947e+06 )
							if( MFI <= 19.6001 )
								if( Typical_Price <= 0.060558 )
									ret := -0.400000
								if( Typical_Price > 0.060558 )
									ret := -0.114286
							if( MFI > 19.6001 )
								if( MFI <= 19.8632 )
									ret := -1.000000 // sell
								if( MFI > 19.8632 )
									ret := -0.375000
						if( Negative_Money_Flow > 1.48947e+06 )
							if( Negative_Money_Flow_Sum <= 4.50134e+06 )
								ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 4.50134e+06 )
								if( Negative_Money_Flow <= 1.57635e+06 )
									ret := 0.500000
								if( Negative_Money_Flow > 1.57635e+06 )
									ret := 0.000000
					if( MFI_Low > 0.054178 )
						if( Raw_Money_Flow <= 1.87231e+06 )
							if( Positive_Money_Flow <= 581975 )
								if( Typical_Price <= 0.062839 )
									ret := 0.041431
								if( Typical_Price > 0.062839 )
									ret := -0.107920
							if( Positive_Money_Flow > 581975 )
								if( Positive_Money_Flow <= 1.62969e+06 )
									ret := 0.083333
								if( Positive_Money_Flow > 1.62969e+06 )
									ret := -0.312500
						if( Raw_Money_Flow > 1.87231e+06 )
							if( Negative_Money_Flow_Sum <= 7.96506e+06 )
								if( Positive_Money_Flow_Sum <= 2.95041e+06 )
									ret := -0.161290
								if( Positive_Money_Flow_Sum > 2.95041e+06 )
									ret := -0.468750
							if( Negative_Money_Flow_Sum > 7.96506e+06 )
								if( VIM <= 1.2024 )
									ret := 0.137931
								if( VIM > 1.2024 )
									ret := -0.500000
				if( Negative_Money_Flow_Sum > 8.9999e+06 )
					if( Typical_Price <= 0.117619 )
						if( Typical_Price <= 0.074519 )
							if( Money_Flow_Ratio <= 0.263173 )
								if( VIM <= 1.38087 )
									ret := -0.043379
								if( VIM > 1.38087 )
									ret := 0.705882 // buy
							if( Money_Flow_Ratio > 0.263173 )
								if( VIM <= 1.15715 )
									ret := 0.328546
								if( VIM > 1.15715 )
									ret := 0.162005
						if( Typical_Price > 0.074519 )
							if( Negative_Money_Flow_Sum <= 1.9004e+07 )
								if( Negative_Money_Flow_Sum <= 1.0059e+07 )
									ret := 0.200000
								if( Negative_Money_Flow_Sum > 1.0059e+07 )
									ret := -0.042773
							if( Negative_Money_Flow_Sum > 1.9004e+07 )
								if( Positive_Money_Flow_Sum <= 3.6945e+07 )
									ret := 0.168312
								if( Positive_Money_Flow_Sum > 3.6945e+07 )
									ret := -0.268293
					if( Typical_Price > 0.117619 )
						if( Negative_Money_Flow_Sum <= 5.47224e+07 )
							if( MFI_High <= -44.4566 )
								if( MFI_High <= -55.3868 )
									ret := 0.032258
								if( MFI_High > -55.3868 )
									ret := -0.162162
							if( MFI_High > -44.4566 )
								if( MFI <= 40.7513 )
									ret := 0.180628
								if( MFI > 40.7513 )
									ret := -0.105590
						if( Negative_Money_Flow_Sum > 5.47224e+07 )
							if( Money_Flow_Ratio <= 0.322072 )
								if( Negative_Money_Flow_Sum <= 5.83467e+07 )
									ret := 0.488372
								if( Negative_Money_Flow_Sum > 5.83467e+07 )
									ret := -0.240223
							if( Money_Flow_Ratio > 0.322072 )
								if( Positive_Money_Flow_Sum <= 3.38407e+07 )
									ret := 0.503788
								if( Positive_Money_Flow_Sum > 3.38407e+07 )
									ret := 0.142077
		if( Raw_Money_Flow > 5.23106e+06 )
			if( Positive_Money_Flow <= 324870 )
				if( Negative_Money_Flow_Sum <= 1.13298e+09 )
					if( Positive_Money_Flow_Sum <= 3.9567e+07 )
						if( Typical_Price <= 0.243042 )
							if( Positive_Money_Flow_Sum <= 2.26677e+07 )
								if( Negative_Money_Flow_Sum <= 8.75723e+07 )
									ret := 0.288222
								if( Negative_Money_Flow_Sum > 8.75723e+07 )
									ret := 0.620438
							if( Positive_Money_Flow_Sum > 2.26677e+07 )
								if( MFI_High <= -52.2592 )
									ret := 0.329480
								if( MFI_High > -52.2592 )
									ret := -0.047059
						if( Typical_Price > 0.243042 )
							if( Negative_Money_Flow_Sum <= 9.73745e+07 )
								if( Money_Flow_Ratio <= 0.278118 )
									ret := -0.651163
								if( Money_Flow_Ratio > 0.278118 )
									ret := -0.151163
							if( Negative_Money_Flow_Sum > 9.73745e+07 )
								if( Negative_Money_Flow_Sum <= 1.50022e+08 )
									ret := 0.452055
								if( Negative_Money_Flow_Sum > 1.50022e+08 )
									ret := -0.466667
					if( Positive_Money_Flow_Sum > 3.9567e+07 )
						if( Negative_Money_Flow_Sum <= 3.78858e+08 )
							if( Typical_Price <= 0.093009 )
								if( Typical_Price <= 0.086536 )
									ret := 0.266667
								if( Typical_Price > 0.086536 )
									ret := -0.608696
							if( Typical_Price > 0.093009 )
								if( Negative_Money_Flow_Sum <= 6.23119e+07 )
									ret := -0.133333
								if( Negative_Money_Flow_Sum > 6.23119e+07 )
									ret := 0.437500
						if( Negative_Money_Flow_Sum > 3.78858e+08 )
							if( Typical_Price <= 0.205661 )
								if( Typical_Price <= 0.155945 )
									ret := 1.000000 // buy
								if( Typical_Price > 0.155945 )
									ret := 0.666667
							if( Typical_Price > 0.205661 )
								if( Negative_Money_Flow_Sum <= 4.55013e+08 )
									ret := -0.600000
								if( Negative_Money_Flow_Sum > 4.55013e+08 )
									ret := 0.206030
				if( Negative_Money_Flow_Sum > 1.13298e+09 )
					if( Negative_Money_Flow <= 1.72826e+08 )
						if( MFI <= 35.6632 )
							if( Typical_Price <= 0.318503 )
								if( Negative_Money_Flow <= 1.34968e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 1.34968e+08 )
									ret := -0.750000 // sell
							if( Typical_Price > 0.318503 )
								ret := -1.000000 // sell
						if( MFI > 35.6632 )
							ret := 0.000000
					if( Negative_Money_Flow > 1.72826e+08 )
						if( Typical_Price <= 0.349341 )
							ret := 1.000000 // buy
						if( Typical_Price > 0.349341 )
							if( Typical_Price <= 0.555547 )
								if( VIP <= 0.776568 )
									ret := 0.000000
								if( VIP > 0.776568 )
									ret := -0.909091 // sell
							if( Typical_Price > 0.555547 )
								if( VIM <= 1.11021 )
									ret := -0.200000
								if( VIM > 1.11021 )
									ret := 0.875000 // buy
			if( Positive_Money_Flow > 324870 )
				if( Positive_Money_Flow_Sum <= 2.9205e+08 )
					if( Positive_Money_Flow_Sum <= 2.78659e+08 )
						if( MFI <= 18.7004 )
							if( VIM <= 1.13705 )
								ret := 1.000000 // buy
							if( VIM > 1.13705 )
								if( Positive_Money_Flow <= 1.83972e+07 )
									ret := -0.428571
								if( Positive_Money_Flow > 1.83972e+07 )
									ret := 0.333333
						if( MFI > 18.7004 )
							if( VIM <= 1.16677 )
								if( Raw_Money_Flow <= 3.56738e+07 )
									ret := -0.068966
								if( Raw_Money_Flow > 3.56738e+07 )
									ret := 0.528302
							if( VIM > 1.16677 )
								if( Positive_Money_Flow <= 7.82551e+06 )
									ret := 0.351266
								if( Positive_Money_Flow > 7.82551e+06 )
									ret := 0.039256
					if( Positive_Money_Flow_Sum > 2.78659e+08 )
						if( Raw_Money_Flow <= 3.05862e+07 )
							ret := -1.000000 // sell
						if( Raw_Money_Flow > 3.05862e+07 )
							if( VIP <= 0.836572 )
								ret := -0.500000
							if( VIP > 0.836572 )
								ret := -0.800000 // sell
				if( Positive_Money_Flow_Sum > 2.9205e+08 )
					if( Negative_Money_Flow_Sum <= 3.73361e+09 )
						if( MFI_Low <= 9.94546 )
							if( Positive_Money_Flow <= 5.90807e+07 )
								ret := 0.500000
							if( Positive_Money_Flow > 5.90807e+07 )
								ret := 1.000000 // buy
						if( MFI_Low > 9.94546 )
							if( VIP <= 0.826073 )
								if( Raw_Money_Flow <= 5.41543e+07 )
									ret := 0.384615
								if( Raw_Money_Flow > 5.41543e+07 )
									ret := -0.529412
							if( VIP > 0.826073 )
								if( Typical_Price <= 0.507075 )
									ret := 0.653846
								if( Typical_Price > 0.507075 )
									ret := -0.148148
					if( Negative_Money_Flow_Sum > 3.73361e+09 )
						ret := -1.000000 // sell
	if( VIP > 0.88877 )
		if( Negative_Money_Flow <= 120.83 )
			if( Typical_Price <= 0.170783 )
				if( Negative_Money_Flow_Sum <= 8.49351e+07 )
					if( VIP <= 1.21172 )
						if( Positive_Money_Flow_Sum <= 3.57672e+07 )
							if( Negative_Money_Flow_Sum <= 4.15191e+07 )
								if( VIM <= 0.960515 )
									ret := -0.000434
								if( VIM > 0.960515 )
									ret := 0.040631
							if( Negative_Money_Flow_Sum > 4.15191e+07 )
								if( VIM <= 1.0813 )
									ret := -0.503067
								if( VIM > 1.0813 )
									ret := -0.082278
						if( Positive_Money_Flow_Sum > 3.57672e+07 )
							if( Raw_Money_Flow <= 9.56399e+06 )
								if( Money_Flow_Ratio <= 4.35198 )
									ret := 0.117647
								if( Money_Flow_Ratio > 4.35198 )
									ret := 0.569767
							if( Raw_Money_Flow > 9.56399e+06 )
								if( Typical_Price <= 0.084465 )
									ret := 0.172414
								if( Typical_Price > 0.084465 )
									ret := -0.103022
					if( VIP > 1.21172 )
						if( Positive_Money_Flow_Sum <= 5.09264e+07 )
							if( Negative_Money_Flow_Sum <= 9.4536e+06 )
								if( Negative_Money_Flow_Sum <= 79218.6 )
									ret := -0.459459
								if( Negative_Money_Flow_Sum > 79218.6 )
									ret := -0.033394
							if( Negative_Money_Flow_Sum > 9.4536e+06 )
								if( Positive_Money_Flow <= 3.84321e+06 )
									ret := -0.036364
								if( Positive_Money_Flow > 3.84321e+06 )
									ret := 0.516129
						if( Positive_Money_Flow_Sum > 5.09264e+07 )
							if( Typical_Price <= 0.051798 )
								if( VIP_VIM <= 0.670129 )
									ret := 1.000000 // buy
								if( VIP_VIM > 0.670129 )
									ret := 0.500000
							if( Typical_Price > 0.051798 )
								if( Typical_Price <= 0.130985 )
									ret := -0.370757
								if( Typical_Price > 0.130985 )
									ret := -0.093496
				if( Negative_Money_Flow_Sum > 8.49351e+07 )
					if( VIM <= 0.83556 )
						if( MFI <= 77.8388 )
							if( Negative_Money_Flow_Sum <= 4.16951e+08 )
								if( VIM <= 0.748606 )
									ret := -0.051282
								if( VIM > 0.748606 )
									ret := 0.700000 // buy
							if( Negative_Money_Flow_Sum > 4.16951e+08 )
								if( Positive_Money_Flow <= 6.33185e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 6.33185e+07 )
									ret := -0.750000 // sell
						if( MFI > 77.8388 )
							if( VIM <= 0.643834 )
								if( Typical_Price <= 0.148167 )
									ret := 0.937500 // buy
								if( Typical_Price > 0.148167 )
									ret := -0.600000
							if( VIM > 0.643834 )
								if( VIP_VIM <= 0.622704 )
									ret := 0.978723 // buy
								if( VIP_VIM > 0.622704 )
									ret := 0.800000 // buy
					if( VIM > 0.83556 )
						if( Negative_Money_Flow_Sum <= 1.02633e+08 )
							if( Money_Flow_Ratio <= 0.684115 )
								if( Typical_Price <= 0.137055 )
									ret := 0.480000
								if( Typical_Price > 0.137055 )
									ret := -0.800000 // sell
							if( Money_Flow_Ratio > 0.684115 )
								if( Money_Flow_Ratio <= 1.4533 )
									ret := 0.517986
								if( Money_Flow_Ratio > 1.4533 )
									ret := 0.158730
						if( Negative_Money_Flow_Sum > 1.02633e+08 )
							if( Positive_Money_Flow_Sum <= 2.67966e+08 )
								if( VIM <= 0.893899 )
									ret := 0.900000 // buy
								if( VIM > 0.893899 )
									ret := 0.027907
							if( Positive_Money_Flow_Sum > 2.67966e+08 )
								if( Raw_Money_Flow <= 5.81542e+07 )
									ret := -0.452174
								if( Raw_Money_Flow > 5.81542e+07 )
									ret := 0.276596
			if( Typical_Price > 0.170783 )
				if( VIM <= 0.698248 )
					if( VIM <= 0.500056 )
						ret := 0.714286 // buy
					if( VIM > 0.500056 )
						if( Negative_Money_Flow_Sum <= 1.54743e+07 )
							if( MFI_High <= 14.9713 )
								if( Raw_Money_Flow <= 1.89263e+07 )
									ret := -0.285714
								if( Raw_Money_Flow > 1.89263e+07 )
									ret := 0.782609 // buy
							if( MFI_High > 14.9713 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 1.54743e+07 )
							if( Negative_Money_Flow_Sum <= 2.45855e+07 )
								if( Typical_Price <= 0.194073 )
									ret := -0.473684
								if( Typical_Price > 0.194073 )
									ret := -0.914894 // sell
							if( Negative_Money_Flow_Sum > 2.45855e+07 )
								if( VIM <= 0.540686 )
									ret := 0.571429
								if( VIM > 0.540686 )
									ret := -0.431694
				if( VIM > 0.698248 )
					if( VIM <= 0.905844 )
						if( Positive_Money_Flow_Sum <= 1.53612e+09 )
							if( Positive_Money_Flow_Sum <= 8.73863e+08 )
								if( Raw_Money_Flow <= 1.32786e+08 )
									ret := -0.099522
								if( Raw_Money_Flow > 1.32786e+08 )
									ret := 0.777778 // buy
							if( Positive_Money_Flow_Sum > 8.73863e+08 )
								if( Typical_Price <= 0.291265 )
									ret := 0.400000
								if( Typical_Price > 0.291265 )
									ret := -0.722892 // sell
						if( Positive_Money_Flow_Sum > 1.53612e+09 )
							if( MFI_Low <= 50.8054 )
								if( MFI <= 62.2805 )
									ret := 0.611111
								if( MFI > 62.2805 )
									ret := -0.523810
							if( MFI_Low > 50.8054 )
								if( Positive_Money_Flow_Sum <= 4.43004e+09 )
									ret := 0.958333 // buy
								if( Positive_Money_Flow_Sum > 4.43004e+09 )
									ret := -0.666667
					if( VIM > 0.905844 )
						if( MFI_High <= -25.3248 )
							if( VIM <= 1.05815 )
								if( Negative_Money_Flow_Sum <= 1.82918e+09 )
									ret := -0.134206
								if( Negative_Money_Flow_Sum > 1.82918e+09 )
									ret := 0.900000 // buy
							if( VIM > 1.05815 )
								if( Negative_Money_Flow_Sum <= 1.20638e+08 )
									ret := -0.030303
								if( Negative_Money_Flow_Sum > 1.20638e+08 )
									ret := 0.157795
						if( MFI_High > -25.3248 )
							if( Positive_Money_Flow_Sum <= 9.86741e+07 )
								if( Money_Flow_Ratio <= 1.55528 )
									ret := 0.164486
								if( Money_Flow_Ratio > 1.55528 )
									ret := -0.178010
							if( Positive_Money_Flow_Sum > 9.86741e+07 )
								if( Positive_Money_Flow_Sum <= 2.91862e+08 )
									ret := 0.342529
								if( Positive_Money_Flow_Sum > 2.91862e+08 )
									ret := -0.042017
		if( Negative_Money_Flow > 120.83 )
			if( Typical_Price <= 0.055277 )
				if( Positive_Money_Flow_Sum <= 6.13214e+08 )
					if( Negative_Money_Flow_Sum <= 4.28754e+08 )
						if( Negative_Money_Flow_Sum <= 7.34559e+07 )
							if( Negative_Money_Flow <= 1.70263e+07 )
								if( MFI <= 44.7112 )
									ret := 0.041633
								if( MFI > 44.7112 )
									ret := 0.137219
							if( Negative_Money_Flow > 1.70263e+07 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 7.34559e+07 )
							if( Negative_Money_Flow_Sum <= 1.34942e+08 )
								if( Money_Flow_Ratio <= 1.73364 )
									ret := 0.757143 // buy
								if( Money_Flow_Ratio > 1.73364 )
									ret := 0.235294
							if( Negative_Money_Flow_Sum > 1.34942e+08 )
								if( Typical_Price <= 0.030805 )
									ret := 1.000000 // buy
								if( Typical_Price > 0.030805 )
									ret := -0.173913
					if( Negative_Money_Flow_Sum > 4.28754e+08 )
						if( Money_Flow_Ratio <= 0.572749 )
							ret := 0.000000
						if( Money_Flow_Ratio > 0.572749 )
							if( MFI <= 45.346 )
								ret := -1.000000 // sell
							if( MFI > 45.346 )
								if( VIM <= 0.898885 )
									ret := -1.000000 // sell
								if( VIM > 0.898885 )
									ret := 0.000000
				if( Positive_Money_Flow_Sum > 6.13214e+08 )
					if( Typical_Price <= 0.047714 )
						ret := 1.000000 // buy
					if( Typical_Price > 0.047714 )
						if( Raw_Money_Flow <= 8.92149e+07 )
							ret := -0.250000
						if( Raw_Money_Flow > 8.92149e+07 )
							if( Typical_Price <= 0.05159 )
								ret := 0.750000 // buy
							if( Typical_Price > 0.05159 )
								ret := 1.000000 // buy
			if( Typical_Price > 0.055277 )
				if( Negative_Money_Flow <= 3.62955e+06 )
					if( Negative_Money_Flow_Sum <= 3.71222e+07 )
						if( VIP <= 1.11713 )
							if( Positive_Money_Flow_Sum <= 4.59916e+07 )
								if( Positive_Money_Flow_Sum <= 3.07656e+07 )
									ret := 0.016381
								if( Positive_Money_Flow_Sum > 3.07656e+07 )
									ret := 0.182028
							if( Positive_Money_Flow_Sum > 4.59916e+07 )
								if( Positive_Money_Flow_Sum <= 5.42314e+07 )
									ret := -0.619718
								if( Positive_Money_Flow_Sum > 5.42314e+07 )
									ret := -0.106383
						if( VIP > 1.11713 )
							if( Positive_Money_Flow_Sum <= 5.81447e+07 )
								if( Positive_Money_Flow_Sum <= 3.70379e+07 )
									ret := 0.098914
								if( Positive_Money_Flow_Sum > 3.70379e+07 )
									ret := -0.079646
							if( Positive_Money_Flow_Sum > 5.81447e+07 )
								if( Typical_Price <= 0.235109 )
									ret := 0.472000
								if( Typical_Price > 0.235109 )
									ret := -0.857143 // sell
					if( Negative_Money_Flow_Sum > 3.71222e+07 )
						if( VIP_VIM <= -0.188283 )
							if( Money_Flow_Ratio <= 0.408195 )
								if( Negative_Money_Flow_Sum <= 5.48593e+07 )
									ret := 0.106383
								if( Negative_Money_Flow_Sum > 5.48593e+07 )
									ret := -0.636364
							if( Money_Flow_Ratio > 0.408195 )
								if( Typical_Price <= 0.16184 )
									ret := 0.588235
								if( Typical_Price > 0.16184 )
									ret := 0.085106
						if( VIP_VIM > -0.188283 )
							if( Raw_Money_Flow <= 3.29365e+06 )
								if( Positive_Money_Flow <= 1.56122e+06 )
									ret := -0.358796
								if( Positive_Money_Flow > 1.56122e+06 )
									ret := 0.750000 // buy
							if( Raw_Money_Flow > 3.29365e+06 )
								if( Negative_Money_Flow_Sum <= 4.63571e+07 )
									ret := -0.415730
								if( Negative_Money_Flow_Sum > 4.63571e+07 )
									ret := 0.088372
				if( Negative_Money_Flow > 3.62955e+06 )
					if( Positive_Money_Flow_Sum <= 4.19285e+07 )
						if( Negative_Money_Flow_Sum <= 4.71442e+07 )
							if( Positive_Money_Flow_Sum <= 2.08192e+07 )
								if( Typical_Price <= 0.065508 )
									ret := 0.750000 // buy
								if( Typical_Price > 0.065508 )
									ret := 0.189516
							if( Positive_Money_Flow_Sum > 2.08192e+07 )
								if( Positive_Money_Flow_Sum <= 2.5301e+07 )
									ret := -0.240000
								if( Positive_Money_Flow_Sum > 2.5301e+07 )
									ret := 0.082231
						if( Negative_Money_Flow_Sum > 4.71442e+07 )
							if( Negative_Money_Flow_Sum <= 5.81246e+07 )
								if( Typical_Price <= 0.148609 )
									ret := -0.653465
								if( Typical_Price > 0.148609 )
									ret := -0.356322
							if( Negative_Money_Flow_Sum > 5.81246e+07 )
								if( VIP_VIM <= -0.085231 )
									ret := 0.068323
								if( VIP_VIM > -0.085231 )
									ret := -0.428571
					if( Positive_Money_Flow_Sum > 4.19285e+07 )
						if( Typical_Price <= 0.262212 )
							if( VIP_VIM <= 0.028281 )
								if( Positive_Money_Flow_Sum <= 5.58013e+07 )
									ret := 0.450902
								if( Positive_Money_Flow_Sum > 5.58013e+07 )
									ret := 0.204276
							if( VIP_VIM > 0.028281 )
								if( Positive_Money_Flow_Sum <= 1.71609e+08 )
									ret := 0.035429
								if( Positive_Money_Flow_Sum > 1.71609e+08 )
									ret := 0.223085
						if( Typical_Price > 0.262212 )
							if( VIP <= 1.18804 )
								if( MFI_Low <= 36.2844 )
									ret := -0.049417
								if( MFI_Low > 36.2844 )
									ret := 0.158580
							if( VIP > 1.18804 )
								if( MFI_High <= -6.82506 )
									ret := -0.500000
								if( MFI_High > -6.82506 )
									ret := -0.045872
	
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
float op_operation = decision_tree_0_DOGEUSDT_30Min_64551742(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)

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


