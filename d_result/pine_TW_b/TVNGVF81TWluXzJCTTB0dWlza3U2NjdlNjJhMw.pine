//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: MSFT_5Min_2BM0_667e62a3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_2BM0_667e62a3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_667e62a3(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bearPower <= -0.050573 )
		if( Raw_Money_Flow <= 897902 )
			if( MFI_Low <= 15.1275 )
				if( bearPower <= -0.414977 )
					if( bullPower <= -1.16345 )
						if( bbp <= -3.48646 )
							if( MFI_Low <= -3.46073 )
								ret := 0.714286 // buy
							if( MFI_Low > -3.46073 )
								ret := 0.416667
						if( bbp > -3.48646 )
							if( bearPower <= -1.63108 )
								ret := 1.000000 // buy
							if( bearPower > -1.63108 )
								if( bullPower <= -1.3103 )
									ret := 0.625000
								if( bullPower > -1.3103 )
									ret := 0.956522 // buy
					if( bullPower > -1.16345 )
						if( Negative_Money_Flow_Sum <= 2.62495e+06 )
							if( Positive_Money_Flow_Sum <= 780348 )
								if( Typical_Price <= 331.19 )
									ret := -0.333333
								if( Typical_Price > 331.19 )
									ret := -0.906977 // sell
							if( Positive_Money_Flow_Sum > 780348 )
								if( Negative_Money_Flow_Sum <= 2.38625e+06 )
									ret := 0.166667
								if( Negative_Money_Flow_Sum > 2.38625e+06 )
									ret := -0.125000
						if( Negative_Money_Flow_Sum > 2.62495e+06 )
							if( Money_Flow_Ratio <= 0.326198 )
								if( MFI <= 19.3035 )
									ret := 0.349666
								if( MFI > 19.3035 )
									ret := 0.547445
							if( Money_Flow_Ratio > 0.326198 )
								if( MFI_High <= -47.8408 )
									ret := 0.027027
								if( MFI_High > -47.8408 )
									ret := 0.578947
				if( bearPower > -0.414977 )
					if( MFI_High <= -46.7522 )
						if( Raw_Money_Flow <= 707547 )
							if( Negative_Money_Flow_Sum <= 1.63857e+06 )
								ret := -0.900000 // sell
							if( Negative_Money_Flow_Sum > 1.63857e+06 )
								if( Typical_Price <= 441.907 )
									ret := 0.111975
								if( Typical_Price > 441.907 )
									ret := 0.392157
						if( Raw_Money_Flow > 707547 )
							if( Money_Flow_Ratio <= 0.262253 )
								if( MFI <= 15.6953 )
									ret := -0.059524
								if( MFI > 15.6953 )
									ret := 0.571429
							if( Money_Flow_Ratio > 0.262253 )
								if( bbm <= 0.157771 )
									ret := -0.481481
								if( bbm > 0.157771 )
									ret := 0.222222
					if( MFI_High > -46.7522 )
						if( Typical_Price <= 338.273 )
							if( Negative_Money_Flow_Sum <= 9.13561e+06 )
								if( Positive_Money_Flow_Sum <= 3.4932e+06 )
									ret := -0.044444
								if( Positive_Money_Flow_Sum > 3.4932e+06 )
									ret := -0.923077 // sell
							if( Negative_Money_Flow_Sum > 9.13561e+06 )
								ret := 0.857143 // buy
						if( Typical_Price > 338.273 )
							if( bearPower <= -0.313159 )
								if( Positive_Money_Flow_Sum <= 4.23827e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 4.23827e+06 )
									ret := 0.818182 // buy
							if( bearPower > -0.313159 )
								if( Raw_Money_Flow <= 518539 )
									ret := 0.650000
								if( Raw_Money_Flow > 518539 )
									ret := -0.157895
			if( MFI_Low > 15.1275 )
				if( Positive_Money_Flow_Sum <= 2.88263e+06 )
					if( Raw_Money_Flow <= 625410 )
						if( MFI_Low <= 52.4361 )
							if( Positive_Money_Flow_Sum <= 2.37621e+06 )
								if( Raw_Money_Flow <= 221934 )
									ret := 0.043478
								if( Raw_Money_Flow > 221934 )
									ret := 0.249458
							if( Positive_Money_Flow_Sum > 2.37621e+06 )
								if( bearPower <= -0.307223 )
									ret := -0.491525
								if( bearPower > -0.307223 )
									ret := -0.005510
						if( MFI_Low > 52.4361 )
							if( Negative_Money_Flow_Sum <= 724801 )
								ret := -0.500000
							if( Negative_Money_Flow_Sum > 724801 )
								ret := 0.944444 // buy
					if( Raw_Money_Flow > 625410 )
						if( Negative_Money_Flow_Sum <= 3.90262e+06 )
							if( Negative_Money_Flow_Sum <= 2.48424e+06 )
								if( bbm <= 0.217792 )
									ret := 0.147059
								if( bbm > 0.217792 )
									ret := -0.666667
							if( Negative_Money_Flow_Sum > 2.48424e+06 )
								if( Money_Flow_Ratio <= 0.658632 )
									ret := -0.950000 // sell
								if( Money_Flow_Ratio > 0.658632 )
									ret := -0.455696
						if( Negative_Money_Flow_Sum > 3.90262e+06 )
							ret := 0.416667
				if( Positive_Money_Flow_Sum > 2.88263e+06 )
					if( Positive_Money_Flow_Sum <= 3.18402e+08 )
						if( bullPower <= 0.33013 )
							if( bearPower <= -0.895483 )
								if( bbm <= 0.4298 )
									ret := 0.352941
								if( bbm > 0.4298 )
									ret := 0.880000 // buy
							if( bearPower > -0.895483 )
								if( MFI_High <= -9.84922 )
									ret := 0.087038
								if( MFI_High > -9.84922 )
									ret := 0.209832
						if( bullPower > 0.33013 )
							if( Money_Flow_Ratio <= 1.06953 )
								ret := -0.416667
							if( Money_Flow_Ratio > 1.06953 )
								if( bbp <= 0.308343 )
									ret := 0.947368 // buy
								if( bbp > 0.308343 )
									ret := 0.533333
					if( Positive_Money_Flow_Sum > 3.18402e+08 )
						if( MFI_Low <= 76.7007 )
							if( bearPower <= -0.091639 )
								if( MFI_High <= 13.975 )
									ret := 0.059172
								if( MFI_High > 13.975 )
									ret := 0.450000
							if( bearPower > -0.091639 )
								if( bbm <= 0.043051 )
									ret := 0.000000
								if( bbm > 0.043051 )
									ret := -0.454545
						if( MFI_Low > 76.7007 )
							if( Positive_Money_Flow_Sum <= 7.44035e+08 )
								if( Raw_Money_Flow <= 280747 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 280747 )
									ret := -0.736842 // sell
							if( Positive_Money_Flow_Sum > 7.44035e+08 )
								if( Money_Flow_Ratio <= 48.213 )
									ret := -0.111111
								if( Money_Flow_Ratio > 48.213 )
									ret := 0.000000
		if( Raw_Money_Flow > 897902 )
			if( Typical_Price <= 407.606 )
				if( MFI <= 25.9853 )
					if( bearPower <= -3.45452 )
						if( MFI_Low <= -13.4236 )
							if( Negative_Money_Flow_Sum <= 1.90671e+09 )
								if( Raw_Money_Flow <= 2.07411e+08 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 2.07411e+08 )
									ret := -0.533333
							if( Negative_Money_Flow_Sum > 1.90671e+09 )
								if( Negative_Money_Flow_Sum <= 2.18855e+09 )
									ret := 0.818182 // buy
								if( Negative_Money_Flow_Sum > 2.18855e+09 )
									ret := 1.000000 // buy
						if( MFI_Low > -13.4236 )
							if( MFI_Low <= -4.69423 )
								if( MFI_Low <= -11.4645 )
									ret := 0.909091 // buy
								if( MFI_Low > -11.4645 )
									ret := 1.000000 // buy
							if( MFI_Low > -4.69423 )
								if( Negative_Money_Flow <= 4.52995e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 4.52995e+07 )
									ret := 0.577778
					if( bearPower > -3.45452 )
						if( bullPower <= -1.36095 )
							if( Money_Flow_Ratio <= 0.224748 )
								if( Positive_Money_Flow_Sum <= 5.68338e+06 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 5.68338e+06 )
									ret := 0.608466
							if( Money_Flow_Ratio > 0.224748 )
								if( Positive_Money_Flow_Sum <= 2.79452e+08 )
									ret := -0.714286 // sell
								if( Positive_Money_Flow_Sum > 2.79452e+08 )
									ret := -0.038462
						if( bullPower > -1.36095 )
							if( Money_Flow_Ratio <= 0.17399 )
								if( Positive_Money_Flow <= 1.56681e+08 )
									ret := -0.029359
								if( Positive_Money_Flow > 1.56681e+08 )
									ret := 0.880000 // buy
							if( Money_Flow_Ratio > 0.17399 )
								if( Negative_Money_Flow_Sum <= 1.93158e+09 )
									ret := 0.165989
								if( Negative_Money_Flow_Sum > 1.93158e+09 )
									ret := -0.164306
				if( MFI > 25.9853 )
					if( Raw_Money_Flow <= 1.72598e+08 )
						if( bbm <= 1.1095 )
							if( MFI_High <= 9.02821 )
								if( bbp <= 0.017493 )
									ret := -0.015985
								if( bbp > 0.017493 )
									ret := 0.058846
							if( MFI_High > 9.02821 )
								if( Negative_Money_Flow_Sum <= 9.36287e+06 )
									ret := 0.307692
								if( Negative_Money_Flow_Sum > 9.36287e+06 )
									ret := -0.377551
						if( bbm > 1.1095 )
							if( MFI <= 29.1308 )
								if( bearPower <= -2.4874 )
									ret := 0.000000
								if( bearPower > -2.4874 )
									ret := -0.450704
							if( MFI > 29.1308 )
								if( Negative_Money_Flow_Sum <= 6.11553e+06 )
									ret := -0.341880
								if( Negative_Money_Flow_Sum > 6.11553e+06 )
									ret := 0.169907
					if( Raw_Money_Flow > 1.72598e+08 )
						if( bullPower <= -0.348149 )
							if( Money_Flow_Ratio <= 0.360756 )
								ret := 0.466667
							if( Money_Flow_Ratio > 0.360756 )
								if( Money_Flow_Ratio <= 0.674325 )
									ret := -0.575221
								if( Money_Flow_Ratio > 0.674325 )
									ret := -0.317881
						if( bullPower > -0.348149 )
							if( Raw_Money_Flow <= 1.57737e+09 )
								if( Typical_Price <= 332.947 )
									ret := 0.166144
								if( Typical_Price > 332.947 )
									ret := -0.230176
							if( Raw_Money_Flow > 1.57737e+09 )
								if( Positive_Money_Flow_Sum <= 2.43402e+09 )
									ret := 0.923077 // buy
								if( Positive_Money_Flow_Sum > 2.43402e+09 )
									ret := 0.166667
			if( Typical_Price > 407.606 )
				if( bbp <= 0.627711 )
					if( Money_Flow_Ratio <= 0.356854 )
						if( Positive_Money_Flow <= 1.19063e+06 )
							if( Negative_Money_Flow_Sum <= 5.9468e+08 )
								if( bullPower <= 1.44131 )
									ret := 0.219189
								if( bullPower > 1.44131 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 5.9468e+08 )
								if( Negative_Money_Flow_Sum <= 1.36321e+09 )
									ret := -0.101089
								if( Negative_Money_Flow_Sum > 1.36321e+09 )
									ret := 0.141148
						if( Positive_Money_Flow > 1.19063e+06 )
							if( bbp <= -2.18539 )
								if( Money_Flow_Ratio <= 0.092263 )
									ret := 0.733333 // buy
								if( Money_Flow_Ratio > 0.092263 )
									ret := -0.531915
							if( bbp > -2.18539 )
								if( bbm <= 1.30557 )
									ret := 0.016807
								if( bbm > 1.30557 )
									ret := -0.549020
					if( Money_Flow_Ratio > 0.356854 )
						if( Negative_Money_Flow_Sum <= 6.04356e+08 )
							if( Negative_Money_Flow_Sum <= 7.81859e+07 )
								if( MFI <= 43.3693 )
									ret := 0.044100
								if( MFI > 43.3693 )
									ret := -0.264937
							if( Negative_Money_Flow_Sum > 7.81859e+07 )
								if( Positive_Money_Flow_Sum <= 2.7152e+09 )
									ret := 0.037916
								if( Positive_Money_Flow_Sum > 2.7152e+09 )
									ret := -0.569231
						if( Negative_Money_Flow_Sum > 6.04356e+08 )
							if( MFI_Low <= 29.1388 )
								if( Negative_Money_Flow_Sum <= 6.36101e+08 )
									ret := -0.565657
								if( Negative_Money_Flow_Sum > 6.36101e+08 )
									ret := -0.248815
							if( MFI_Low > 29.1388 )
								if( bbp <= -0.51989 )
									ret := -0.019868
								if( bbp > -0.51989 )
									ret := 0.319249
				if( bbp > 0.627711 )
					if( bullPower <= 2.1442 )
						if( Negative_Money_Flow <= 6.58132e+07 )
							if( Positive_Money_Flow_Sum <= 2.39464e+07 )
								if( Typical_Price <= 429.173 )
									ret := -0.724138 // sell
								if( Typical_Price > 429.173 )
									ret := -0.428571
							if( Positive_Money_Flow_Sum > 2.39464e+07 )
								if( bullPower <= 1.67808 )
									ret := -0.372549
								if( bullPower > 1.67808 )
									ret := 0.280000
						if( Negative_Money_Flow > 6.58132e+07 )
							if( Negative_Money_Flow <= 8.9348e+07 )
								if( Negative_Money_Flow_Sum <= 4.00523e+08 )
									ret := 0.583333
								if( Negative_Money_Flow_Sum > 4.00523e+08 )
									ret := 0.900000 // buy
							if( Negative_Money_Flow > 8.9348e+07 )
								if( bbm <= 2.47982 )
									ret := 0.175000
								if( bbm > 2.47982 )
									ret := -0.800000 // sell
					if( bullPower > 2.1442 )
						if( bearPower <= -0.580677 )
							if( Positive_Money_Flow_Sum <= 5.37027e+08 )
								if( Raw_Money_Flow <= 7.1853e+06 )
									ret := -0.818182 // sell
								if( Raw_Money_Flow > 7.1853e+06 )
									ret := -0.987500 // sell
							if( Positive_Money_Flow_Sum > 5.37027e+08 )
								ret := -0.111111
						if( bearPower > -0.580677 )
							if( bbp <= 2.86311 )
								if( MFI_High <= -7.29746 )
									ret := 0.444444
								if( MFI_High > -7.29746 )
									ret := -0.250000
							if( bbp > 2.86311 )
								ret := -0.736842 // sell
	if( bearPower > -0.050573 )
		if( Negative_Money_Flow_Sum <= 1.09408e+08 )
			if( bullPower <= 0.399927 )
				if( Money_Flow_Ratio <= 0.271016 )
					if( Positive_Money_Flow_Sum <= 3.83104e+06 )
						if( Negative_Money_Flow_Sum <= 3.72729e+07 )
							if( Typical_Price <= 410.812 )
								if( Typical_Price <= 343.57 )
									ret := 0.275362
								if( Typical_Price > 343.57 )
									ret := 0.707317 // buy
							if( Typical_Price > 410.812 )
								if( Positive_Money_Flow_Sum <= 1.53688e+06 )
									ret := -0.040000
								if( Positive_Money_Flow_Sum > 1.53688e+06 )
									ret := 0.119048
						if( Negative_Money_Flow_Sum > 3.72729e+07 )
							if( Positive_Money_Flow_Sum <= 2.35037e+06 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 2.35037e+06 )
								ret := -0.625000
					if( Positive_Money_Flow_Sum > 3.83104e+06 )
						if( Positive_Money_Flow_Sum <= 5.88473e+06 )
							if( BBPower_Color <= 0.5 )
								ret := -0.222222
							if( BBPower_Color > 0.5 )
								if( Raw_Money_Flow <= 136785 )
									ret := 0.076923
								if( Raw_Money_Flow > 136785 )
									ret := 0.000000
						if( Positive_Money_Flow_Sum > 5.88473e+06 )
							if( Negative_Money_Flow_Sum <= 1.04825e+08 )
								if( bbp <= 0.316346 )
									ret := -0.185185
								if( bbp > 0.316346 )
									ret := 0.222222
							if( Negative_Money_Flow_Sum > 1.04825e+08 )
								if( bbm <= 0.066134 )
									ret := -0.666667
								if( bbm > 0.066134 )
									ret := -1.000000 // sell
				if( Money_Flow_Ratio > 0.271016 )
					if( bearPower <= 0.062324 )
						if( Positive_Money_Flow_Sum <= 6.93734e+06 )
							if( MFI_Low <= 31.3036 )
								if( MFI <= 48.2731 )
									ret := -0.071784
								if( MFI > 48.2731 )
									ret := -0.338164
							if( MFI_Low > 31.3036 )
								if( Negative_Money_Flow_Sum <= 4.86741e+06 )
									ret := 0.042089
								if( Negative_Money_Flow_Sum > 4.86741e+06 )
									ret := 0.485714
						if( Positive_Money_Flow_Sum > 6.93734e+06 )
							if( Money_Flow_Ratio <= 2.83828 )
								if( Positive_Money_Flow_Sum <= 7.3066e+06 )
									ret := -0.686275
								if( Positive_Money_Flow_Sum > 7.3066e+06 )
									ret := -0.200620
							if( Money_Flow_Ratio > 2.83828 )
								if( Money_Flow_Ratio <= 3.69059 )
									ret := 0.351064
								if( Money_Flow_Ratio > 3.69059 )
									ret := -0.050000
					if( bearPower > 0.062324 )
						if( Raw_Money_Flow <= 181381 )
							if( Typical_Price <= 366.539 )
								if( Money_Flow_Ratio <= 2.68323 )
									ret := -0.151246
								if( Money_Flow_Ratio > 2.68323 )
									ret := -0.417671
							if( Typical_Price > 366.539 )
								if( MFI_High <= -46.0548 )
									ret := -0.432099
								if( MFI_High > -46.0548 )
									ret := -0.010664
						if( Raw_Money_Flow > 181381 )
							if( Raw_Money_Flow <= 1.67992e+06 )
								if( Positive_Money_Flow_Sum <= 812968 )
									ret := -0.687500
								if( Positive_Money_Flow_Sum > 812968 )
									ret := 0.056433
							if( Raw_Money_Flow > 1.67992e+06 )
								if( MFI_High <= -22.3248 )
									ret := 0.034188
								if( MFI_High > -22.3248 )
									ret := -0.298077
			if( bullPower > 0.399927 )
				if( Money_Flow_Ratio <= 25.6111 )
					if( Raw_Money_Flow <= 1.02005e+08 )
						if( MFI <= 85.4742 )
							if( Negative_Money_Flow <= 1.48776e+06 )
								if( bbp <= 2.28394 )
									ret := -0.177143
								if( bbp > 2.28394 )
									ret := 0.035842
							if( Negative_Money_Flow > 1.48776e+06 )
								if( Money_Flow_Ratio <= 1.3603 )
									ret := -0.227074
								if( Money_Flow_Ratio > 1.3603 )
									ret := 0.209091
						if( MFI > 85.4742 )
							if( Money_Flow_Ratio <= 13.3434 )
								if( Positive_Money_Flow_Sum <= 4.75254e+08 )
									ret := -0.033186
								if( Positive_Money_Flow_Sum > 4.75254e+08 )
									ret := 0.301370
							if( Money_Flow_Ratio > 13.3434 )
								if( MFI <= 94.2471 )
									ret := -0.568807
								if( MFI > 94.2471 )
									ret := -0.110169
					if( Raw_Money_Flow > 1.02005e+08 )
						if( bbp <= 1.4107 )
							if( Typical_Price <= 365.388 )
								if( Negative_Money_Flow_Sum <= 6.229e+07 )
									ret := -0.176471
								if( Negative_Money_Flow_Sum > 6.229e+07 )
									ret := -0.636364
							if( Typical_Price > 365.388 )
								ret := 0.066667
						if( bbp > 1.4107 )
							if( MFI_Low <= 74.9006 )
								if( bbp <= 1.73889 )
									ret := -1.000000 // sell
								if( bbp > 1.73889 )
									ret := -0.691057
							if( MFI_Low > 74.9006 )
								if( bearPower <= 0.437206 )
									ret := 0.666667
								if( bearPower > 0.437206 )
									ret := -0.882353 // sell
				if( Money_Flow_Ratio > 25.6111 )
					if( Typical_Price <= 346.675 )
						if( Positive_Money_Flow <= 1.89181e+08 )
							if( bullPower <= 2.15749 )
								if( Positive_Money_Flow_Sum <= 1.56686e+08 )
									ret := 0.807692 // buy
								if( Positive_Money_Flow_Sum > 1.56686e+08 )
									ret := 0.150000
							if( bullPower > 2.15749 )
								if( MFI_Low <= 78.7554 )
									ret := -0.666667
								if( MFI_Low > 78.7554 )
									ret := -0.187500
						if( Positive_Money_Flow > 1.89181e+08 )
							if( Negative_Money_Flow_Sum <= 2.73739e+07 )
								if( bbm <= 1.20724 )
									ret := 0.966667 // buy
								if( bbm > 1.20724 )
									ret := 0.666667
							if( Negative_Money_Flow_Sum > 2.73739e+07 )
								if( bbm <= 1.23653 )
									ret := 0.222222
								if( bbm > 1.23653 )
									ret := 0.750000 // buy
					if( Typical_Price > 346.675 )
						if( Positive_Money_Flow_Sum <= 8.6124e+08 )
							if( Positive_Money_Flow <= 1.3348e+08 )
								if( Money_Flow_Ratio <= 31.5438 )
									ret := 0.805556 // buy
								if( Money_Flow_Ratio > 31.5438 )
									ret := -0.394737
							if( Positive_Money_Flow > 1.3348e+08 )
								if( Negative_Money_Flow_Sum <= 2.15012e+07 )
									ret := 0.569767
								if( Negative_Money_Flow_Sum > 2.15012e+07 )
									ret := -0.666667
						if( Positive_Money_Flow_Sum > 8.6124e+08 )
							if( bbp <= 4.00873 )
								if( bbm <= 0.652141 )
									ret := -0.461538
								if( bbm > 0.652141 )
									ret := 0.571429
							if( bbp > 4.00873 )
								if( bullPower <= 3.055 )
									ret := -0.375000
								if( bullPower > 3.055 )
									ret := -0.842105 // sell
		if( Negative_Money_Flow_Sum > 1.09408e+08 )
			if( bullPower <= 1.60687 )
				if( bbp <= 0.617641 )
					if( Typical_Price <= 362.405 )
						if( bullPower <= 0.420147 )
							if( Negative_Money_Flow <= 2.69652e+07 )
								if( bullPower <= 0.319091 )
									ret := -0.011858
								if( bullPower > 0.319091 )
									ret := 0.129412
							if( Negative_Money_Flow > 2.69652e+07 )
								if( Raw_Money_Flow <= 3.34321e+07 )
									ret := 0.680556
								if( Raw_Money_Flow > 3.34321e+07 )
									ret := 0.160622
						if( bullPower > 0.420147 )
							if( Raw_Money_Flow <= 8.72836e+07 )
								if( bullPower <= 0.501358 )
									ret := -0.153846
								if( bullPower > 0.501358 )
									ret := 0.126316
							if( Raw_Money_Flow > 8.72836e+07 )
								if( Positive_Money_Flow <= 9.45223e+07 )
									ret := -0.666667
								if( Positive_Money_Flow > 9.45223e+07 )
									ret := -0.078947
					if( Typical_Price > 362.405 )
						if( Negative_Money_Flow <= 2.41399e+07 )
							if( MFI_Low <= -17.6265 )
								if( BBPower_Color <= 0.5 )
									ret := -0.652174
								if( BBPower_Color > 0.5 )
									ret := -0.211268
							if( MFI_Low > -17.6265 )
								if( Negative_Money_Flow_Sum <= 1.17814e+08 )
									ret := 0.513514
								if( Negative_Money_Flow_Sum > 1.17814e+08 )
									ret := -0.023879
						if( Negative_Money_Flow > 2.41399e+07 )
							if( Money_Flow_Ratio <= 2.20097 )
								if( Raw_Money_Flow <= 2.97567e+07 )
									ret := -0.586466
								if( Raw_Money_Flow > 2.97567e+07 )
									ret := -0.265421
							if( Money_Flow_Ratio > 2.20097 )
								if( bbp <= 0.590315 )
									ret := 0.020619
								if( bbp > 0.590315 )
									ret := 0.571429
				if( bbp > 0.617641 )
					if( Positive_Money_Flow_Sum <= 7.0225e+08 )
						if( bbm <= 0.538201 )
							if( Positive_Money_Flow_Sum <= 6.81571e+08 )
								if( MFI <= 67.5019 )
									ret := 0.086390
								if( MFI > 67.5019 )
									ret := 0.193249
							if( Positive_Money_Flow_Sum > 6.81571e+08 )
								if( Negative_Money_Flow_Sum <= 1.72022e+08 )
									ret := -0.444444
								if( Negative_Money_Flow_Sum > 1.72022e+08 )
									ret := 0.704762 // buy
						if( bbm > 0.538201 )
							if( Raw_Money_Flow <= 3.78429e+07 )
								if( Positive_Money_Flow <= 3.72209e+07 )
									ret := 0.189573
								if( Positive_Money_Flow > 3.72209e+07 )
									ret := 0.800000 // buy
							if( Raw_Money_Flow > 3.78429e+07 )
								if( MFI_High <= -45.0675 )
									ret := -0.631579
								if( MFI_High > -45.0675 )
									ret := -0.022786
					if( Positive_Money_Flow_Sum > 7.0225e+08 )
						if( MFI_High <= -11.666 )
							if( Negative_Money_Flow <= 1.08653e+08 )
								if( MFI_Low <= 40.6833 )
									ret := 0.111594
								if( MFI_Low > 40.6833 )
									ret := -0.279433
							if( Negative_Money_Flow > 1.08653e+08 )
								if( Negative_Money_Flow <= 1.17064e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow > 1.17064e+08 )
									ret := -0.291339
						if( MFI_High > -11.666 )
							if( Typical_Price <= 310.76 )
								if( Raw_Money_Flow <= 1.00535e+08 )
									ret := -0.700000 // sell
								if( Raw_Money_Flow > 1.00535e+08 )
									ret := -0.300000
							if( Typical_Price > 310.76 )
								if( Positive_Money_Flow <= 1.08603e+08 )
									ret := 0.011241
								if( Positive_Money_Flow > 1.08603e+08 )
									ret := 0.292585
			if( bullPower > 1.60687 )
				if( Typical_Price <= 426.22 )
					if( Negative_Money_Flow <= 1.23058e+06 )
						if( Typical_Price <= 302.412 )
							if( Negative_Money_Flow_Sum <= 2.04154e+08 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 2.04154e+08 )
								ret := -0.400000
						if( Typical_Price > 302.412 )
							if( Raw_Money_Flow <= 3.981e+08 )
								if( Negative_Money_Flow_Sum <= 1.22227e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 1.22227e+08 )
									ret := -0.292632
							if( Raw_Money_Flow > 3.981e+08 )
								if( MFI <= 83.9388 )
									ret := 0.857143 // buy
								if( MFI > 83.9388 )
									ret := -0.117647
					if( Negative_Money_Flow > 1.23058e+06 )
						if( MFI <= 56.9738 )
							if( Positive_Money_Flow_Sum <= 1.48066e+09 )
								if( Negative_Money_Flow <= 5.08732e+07 )
									ret := 0.941176 // buy
								if( Negative_Money_Flow > 5.08732e+07 )
									ret := -0.590909
							if( Positive_Money_Flow_Sum > 1.48066e+09 )
								ret := 1.000000 // buy
						if( MFI > 56.9738 )
							if( bbm <= 2.32542 )
								if( bullPower <= 1.92584 )
									ret := -0.429688
								if( bullPower > 1.92584 )
									ret := -0.036735
							if( bbm > 2.32542 )
								if( Negative_Money_Flow <= 8.22279e+07 )
									ret := 0.208333
								if( Negative_Money_Flow > 8.22279e+07 )
									ret := 0.900000 // buy
				if( Typical_Price > 426.22 )
					if( bearPower <= 0.533613 )
						if( bearPower <= 0.323222 )
							ret := 0.400000
						if( bearPower > 0.323222 )
							ret := -0.111111
					if( bearPower > 0.533613 )
						if( bbp <= 3.55497 )
							if( Typical_Price <= 450.114 )
								if( Typical_Price <= 431.714 )
									ret := -0.307692
								if( Typical_Price > 431.714 )
									ret := -0.901961 // sell
							if( Typical_Price > 450.114 )
								if( bullPower <= 1.83832 )
									ret := -0.500000
								if( bullPower > 1.83832 )
									ret := -0.272727
						if( bbp > 3.55497 )
							if( Positive_Money_Flow <= 1.39499e+08 )
								if( bbp <= 4.30346 )
									ret := -1.000000 // sell
								if( bbp > 4.30346 )
									ret := -0.900000 // sell
							if( Positive_Money_Flow > 1.39499e+08 )
								if( bbm <= 1.38658 )
									ret := -0.777778 // sell
								if( bbm > 1.38658 )
									ret := -0.900000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_MSFT_5Min_667e62a3(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


