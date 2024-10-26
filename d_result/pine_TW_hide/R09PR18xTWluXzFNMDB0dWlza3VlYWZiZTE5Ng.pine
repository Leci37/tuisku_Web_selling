//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: GOOG_1Min_1M00_eafbe196 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GOOG_1Min_1M00_eafbe196", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GOOG_1Min_eafbe196(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Negative_Money_Flow <= 367.308 )
		if( MFI_High <= 1.78415 )
			if( Positive_Money_Flow_Sum <= 5.4526e+08 )
				if( Positive_Money_Flow <= 2.84692e+07 )
					if( MFI_Low <= 60.0568 )
						if( Positive_Money_Flow_Sum <= 1.35452e+08 )
							if( Typical_Price <= 167.763 )
								if( Money_Flow_Ratio <= 0.917224 )
									ret := -0.033864
								if( Money_Flow_Ratio > 0.917224 )
									ret := 0.039042
							if( Typical_Price > 167.763 )
								if( Negative_Money_Flow_Sum <= 405359 )
									ret := -0.262982
								if( Negative_Money_Flow_Sum > 405359 )
									ret := -0.044173
						if( Positive_Money_Flow_Sum > 1.35452e+08 )
							if( MFI_Low <= 13.0838 )
								if( MFI_Low <= -2.94087 )
									ret := -0.555556
								if( MFI_Low > -2.94087 )
									ret := 0.318681
							if( MFI_Low > 13.0838 )
								if( MFI_High <= -30.4649 )
									ret := -0.808219 // sell
								if( MFI_High > -30.4649 )
									ret := -0.224168
					if( MFI_Low > 60.0568 )
						if( Positive_Money_Flow <= 2.15758e+06 )
							if( Raw_Money_Flow <= 308666 )
								if( Positive_Money_Flow <= 108724 )
									ret := -0.106796
								if( Positive_Money_Flow > 108724 )
									ret := 0.337209
							if( Raw_Money_Flow > 308666 )
								if( MFI <= 80.3292 )
									ret := 0.240000
								if( MFI > 80.3292 )
									ret := -0.442105
						if( Positive_Money_Flow > 2.15758e+06 )
							if( Typical_Price <= 166.005 )
								if( Negative_Money_Flow_Sum <= 1.85318e+07 )
									ret := 0.628571
								if( Negative_Money_Flow_Sum > 1.85318e+07 )
									ret := -0.266667
							if( Typical_Price > 166.005 )
								if( Money_Flow_Ratio <= 4.1344 )
									ret := 0.403509
								if( Money_Flow_Ratio > 4.1344 )
									ret := 0.047431
				if( Positive_Money_Flow > 2.84692e+07 )
					if( Negative_Money_Flow_Sum <= 6.28865e+07 )
						if( Positive_Money_Flow <= 4.76962e+07 )
							if( Money_Flow_Ratio <= 1.94763 )
								ret := 0.900000 // buy
							if( Money_Flow_Ratio > 1.94763 )
								if( Typical_Price <= 165.058 )
									ret := 0.555556
								if( Typical_Price > 165.058 )
									ret := 0.909091 // buy
						if( Positive_Money_Flow > 4.76962e+07 )
							if( Money_Flow_Ratio <= 3.2312 )
								ret := 0.600000
							if( Money_Flow_Ratio > 3.2312 )
								ret := -0.333333
					if( Negative_Money_Flow_Sum > 6.28865e+07 )
						if( Money_Flow_Ratio <= 1.79087 )
							if( MFI_High <= -20.6204 )
								if( Positive_Money_Flow <= 4.90091e+07 )
									ret := 0.034247
								if( Positive_Money_Flow > 4.90091e+07 )
									ret := 0.555556
							if( MFI_High > -20.6204 )
								if( Positive_Money_Flow_Sum <= 1.8164e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 1.8164e+08 )
									ret := 0.750000 // buy
						if( Money_Flow_Ratio > 1.79087 )
							if( Typical_Price <= 168.545 )
								if( Typical_Price <= 162.595 )
									ret := -0.388889
								if( Typical_Price > 162.595 )
									ret := 0.187500
							if( Typical_Price > 168.545 )
								if( MFI_High <= -7.49525 )
									ret := -0.892857 // sell
								if( MFI_High > -7.49525 )
									ret := -0.250000
			if( Positive_Money_Flow_Sum > 5.4526e+08 )
				if( Positive_Money_Flow <= 4.58295e+08 )
					if( MFI <= 79.5492 )
						if( Positive_Money_Flow_Sum <= 6.58039e+08 )
							if( MFI_High <= -5.12699 )
								if( Raw_Money_Flow <= 4.40556e+07 )
									ret := -0.428571
								if( Raw_Money_Flow > 4.40556e+07 )
									ret := -1.000000 // sell
							if( MFI_High > -5.12699 )
								ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 6.58039e+08 )
							if( MFI_High <= -11.4794 )
								if( Negative_Money_Flow_Sum <= 4.27337e+08 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 4.27337e+08 )
									ret := -0.571429
							if( MFI_High > -11.4794 )
								ret := 0.000000
					if( MFI > 79.5492 )
						if( Positive_Money_Flow_Sum <= 6.3273e+08 )
							ret := -0.454545
						if( Positive_Money_Flow_Sum > 6.3273e+08 )
							ret := 0.000000
				if( Positive_Money_Flow > 4.58295e+08 )
					ret := 0.400000
		if( MFI_High > 1.78415 )
			if( Money_Flow_Ratio <= 10.9239 )
				if( Negative_Money_Flow_Sum <= 1.91719e+07 )
					if( Positive_Money_Flow_Sum <= 8.00946e+07 )
						if( Positive_Money_Flow <= 29946.5 )
							if( Money_Flow_Ratio <= 5.54366 )
								if( MFI_High <= 3.81639 )
									ret := 0.261905
								if( MFI_High > 3.81639 )
									ret := -0.333333
							if( Money_Flow_Ratio > 5.54366 )
								if( MFI <= 85.1367 )
									ret := 0.933333 // buy
								if( MFI > 85.1367 )
									ret := 0.346154
						if( Positive_Money_Flow > 29946.5 )
							if( Positive_Money_Flow <= 2.52935e+06 )
								if( Positive_Money_Flow <= 2.20039e+06 )
									ret := -0.043152
								if( Positive_Money_Flow > 2.20039e+06 )
									ret := 0.482143
							if( Positive_Money_Flow > 2.52935e+06 )
								if( MFI_High <= 3.35749 )
									ret := -0.333333
								if( MFI_High > 3.35749 )
									ret := -0.076628
					if( Positive_Money_Flow_Sum > 8.00946e+07 )
						if( Negative_Money_Flow_Sum <= 1.05025e+07 )
							if( Negative_Money_Flow_Sum <= 1.03111e+07 )
								if( MFI_Low <= 70.9448 )
									ret := 0.926829 // buy
								if( MFI_Low > 70.9448 )
									ret := 0.714286 // buy
							if( Negative_Money_Flow_Sum > 1.03111e+07 )
								if( Money_Flow_Ratio <= 9.88758 )
									ret := 0.125000
								if( Money_Flow_Ratio > 9.88758 )
									ret := 0.833333 // buy
						if( Negative_Money_Flow_Sum > 1.05025e+07 )
							if( MFI <= 89.1918 )
								if( MFI_Low <= 68.3109 )
									ret := 0.197674
								if( MFI_Low > 68.3109 )
									ret := 0.826087 // buy
							if( MFI > 89.1918 )
								if( Positive_Money_Flow <= 9.49615e+06 )
									ret := 0.222222
								if( Positive_Money_Flow > 9.49615e+06 )
									ret := -0.454545
				if( Negative_Money_Flow_Sum > 1.91719e+07 )
					if( Raw_Money_Flow <= 4.81195e+08 )
						if( Positive_Money_Flow <= 8.13529e+06 )
							if( Negative_Money_Flow_Sum <= 2.03808e+07 )
								ret := 0.500000
							if( Negative_Money_Flow_Sum > 2.03808e+07 )
								if( Positive_Money_Flow_Sum <= 6.68215e+08 )
									ret := -0.260116
								if( Positive_Money_Flow_Sum > 6.68215e+08 )
									ret := 0.187500
						if( Positive_Money_Flow > 8.13529e+06 )
							if( Money_Flow_Ratio <= 9.51835 )
								if( Negative_Money_Flow_Sum <= 1.20675e+08 )
									ret := -0.514000
								if( Negative_Money_Flow_Sum > 1.20675e+08 )
									ret := 0.285714
							if( Money_Flow_Ratio > 9.51835 )
								ret := 0.318182
					if( Raw_Money_Flow > 4.81195e+08 )
						if( Raw_Money_Flow <= 5.54447e+08 )
							ret := 0.764706 // buy
						if( Raw_Money_Flow > 5.54447e+08 )
							ret := 0.000000
			if( Money_Flow_Ratio > 10.9239 )
				if( Positive_Money_Flow <= 103311 )
					if( Positive_Money_Flow_Sum <= 3.12104e+06 )
						if( MFI_High <= 12.8472 )
							ret := -0.727273 // sell
						if( MFI_High > 12.8472 )
							ret := -0.083333
					if( Positive_Money_Flow_Sum > 3.12104e+06 )
						if( Typical_Price <= 160.318 )
							if( Typical_Price <= 157.744 )
								ret := 0.444444
							if( Typical_Price > 157.744 )
								if( MFI <= 94.5891 )
									ret := 0.642857
								if( MFI > 94.5891 )
									ret := 1.000000 // buy
						if( Typical_Price > 160.318 )
							if( MFI <= 99.5885 )
								if( Money_Flow_Ratio <= 29.4998 )
									ret := 0.140000
								if( Money_Flow_Ratio > 29.4998 )
									ret := -0.326531
							if( MFI > 99.5885 )
								ret := 0.454545
				if( Positive_Money_Flow > 103311 )
					if( Raw_Money_Flow <= 1.33559e+06 )
						if( Raw_Money_Flow <= 302716 )
							if( MFI_Low <= 74.6222 )
								if( Negative_Money_Flow_Sum <= 587253 )
									ret := -0.742857 // sell
								if( Negative_Money_Flow_Sum > 587253 )
									ret := -0.083333
							if( MFI_Low > 74.6222 )
								if( Typical_Price <= 160.506 )
									ret := 0.300000
								if( Typical_Price > 160.506 )
									ret := -0.234043
						if( Raw_Money_Flow > 302716 )
							if( MFI_High <= 13.661 )
								if( Money_Flow_Ratio <= 11.2195 )
									ret := -0.777778 // sell
								if( Money_Flow_Ratio > 11.2195 )
									ret := -1.000000 // sell
							if( MFI_High > 13.661 )
								if( Positive_Money_Flow <= 1.02938e+06 )
									ret := -0.621622
								if( Positive_Money_Flow > 1.02938e+06 )
									ret := -0.076923
					if( Raw_Money_Flow > 1.33559e+06 )
						if( Positive_Money_Flow <= 7.30419e+06 )
							if( Negative_Money_Flow_Sum <= 1.8836e+07 )
								if( Positive_Money_Flow_Sum <= 5.12379e+07 )
									ret := -0.134831
								if( Positive_Money_Flow_Sum > 5.12379e+07 )
									ret := 0.417323
							if( Negative_Money_Flow_Sum > 1.8836e+07 )
								if( MFI_Low <= 73.9657 )
									ret := -0.857143 // sell
								if( MFI_Low > 73.9657 )
									ret := 0.090909
						if( Positive_Money_Flow > 7.30419e+06 )
							if( Negative_Money_Flow_Sum <= 1.70889e+07 )
								if( Typical_Price <= 186.553 )
									ret := -0.392424
								if( Typical_Price > 186.553 )
									ret := 0.862069 // buy
							if( Negative_Money_Flow_Sum > 1.70889e+07 )
								if( Typical_Price <= 164.326 )
									ret := 0.711111 // buy
								if( Typical_Price > 164.326 )
									ret := -0.220339
	if( Negative_Money_Flow > 367.308 )
		if( Negative_Money_Flow <= 3.61107e+06 )
			if( Negative_Money_Flow_Sum <= 357777 )
				if( Positive_Money_Flow <= 134.062 )
					if( MFI_Low <= 61.5366 )
						if( Negative_Money_Flow_Sum <= 323010 )
							if( Negative_Money_Flow <= 18380.5 )
								if( Positive_Money_Flow_Sum <= 458156 )
									ret := 0.846154 // buy
								if( Positive_Money_Flow_Sum > 458156 )
									ret := 0.375000
							if( Negative_Money_Flow > 18380.5 )
								if( MFI_High <= -4.96347 )
									ret := -0.035088
								if( MFI_High > -4.96347 )
									ret := 0.393939
						if( Negative_Money_Flow_Sum > 323010 )
							if( Negative_Money_Flow <= 35673.1 )
								if( Typical_Price <= 167.692 )
									ret := 0.000000
								if( Typical_Price > 167.692 )
									ret := -0.933333 // sell
							if( Negative_Money_Flow > 35673.1 )
								if( Typical_Price <= 162.914 )
									ret := -0.687500
								if( Typical_Price > 162.914 )
									ret := -0.115942
					if( MFI_Low > 61.5366 )
						if( MFI_High <= 3.87412 )
							if( Negative_Money_Flow_Sum <= 140343 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 140343 )
								if( MFI_High <= 2.36479 )
									ret := -1.000000 // sell
								if( MFI_High > 2.36479 )
									ret := -0.279070
						if( MFI_High > 3.87412 )
							if( MFI <= 86.6638 )
								if( Raw_Money_Flow <= 47365.1 )
									ret := 0.318182
								if( Raw_Money_Flow > 47365.1 )
									ret := -0.566667
							if( MFI > 86.6638 )
								if( Typical_Price <= 173.673 )
									ret := 0.418605
								if( Typical_Price > 173.673 )
									ret := -0.200000
				if( Positive_Money_Flow > 134.062 )
					if( Typical_Price <= 182.292 )
						if( MFI_High <= 11.0105 )
							if( Negative_Money_Flow_Sum <= 169400 )
								ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 169400 )
								if( MFI_High <= 5.88613 )
									ret := -0.536232
								if( MFI_High > 5.88613 )
									ret := -1.000000 // sell
						if( MFI_High > 11.0105 )
							ret := -0.333333
					if( Typical_Price > 182.292 )
						ret := 0.272727
			if( Negative_Money_Flow_Sum > 357777 )
				if( Raw_Money_Flow <= 46209.2 )
					if( Money_Flow_Ratio <= 1.76944 )
						if( MFI <= 56.8327 )
							if( Negative_Money_Flow_Sum <= 2.64786e+06 )
								if( MFI_High <= -57.2918 )
									ret := 0.526829
								if( MFI_High > -57.2918 )
									ret := 0.228010
							if( Negative_Money_Flow_Sum > 2.64786e+06 )
								if( MFI <= 12.5237 )
									ret := 0.129630
								if( MFI > 12.5237 )
									ret := -0.409091
						if( MFI > 56.8327 )
							if( Typical_Price <= 181.381 )
								if( Positive_Money_Flow_Sum <= 609213 )
									ret := -0.157895
								if( Positive_Money_Flow_Sum > 609213 )
									ret := 0.726457 // buy
							if( Typical_Price > 181.381 )
								ret := -0.214286
					if( Money_Flow_Ratio > 1.76944 )
						if( Typical_Price <= 158.353 )
							if( MFI_High <= -3.71653 )
								ret := 0.384615
							if( MFI_High > -3.71653 )
								if( Negative_Money_Flow_Sum <= 523710 )
									ret := 0.300000
								if( Negative_Money_Flow_Sum > 523710 )
									ret := 1.000000 // buy
						if( Typical_Price > 158.353 )
							if( Money_Flow_Ratio <= 1.89552 )
								if( MFI_Low <= 45.046 )
									ret := -0.314286
								if( MFI_Low > 45.046 )
									ret := -0.730769 // sell
							if( Money_Flow_Ratio > 1.89552 )
								if( Raw_Money_Flow <= 33036.4 )
									ret := 0.160194
								if( Raw_Money_Flow > 33036.4 )
									ret := -0.137168
				if( Raw_Money_Flow > 46209.2 )
					if( Positive_Money_Flow <= 11.5204 )
						if( MFI <= 39.2413 )
							if( MFI_High <= -79.971 )
								ret := -0.727273 // sell
							if( MFI_High > -79.971 )
								if( Positive_Money_Flow_Sum <= 3.83526e+06 )
									ret := 0.143312
								if( Positive_Money_Flow_Sum > 3.83526e+06 )
									ret := 0.054563
						if( MFI > 39.2413 )
							if( Negative_Money_Flow <= 2.57435e+06 )
								if( Money_Flow_Ratio <= 6.90806 )
									ret := 0.000943
								if( Money_Flow_Ratio > 6.90806 )
									ret := 0.198347
							if( Negative_Money_Flow > 2.57435e+06 )
								if( Negative_Money_Flow_Sum <= 2.55044e+07 )
									ret := 0.167096
								if( Negative_Money_Flow_Sum > 2.55044e+07 )
									ret := -0.054333
					if( Positive_Money_Flow > 11.5204 )
						if( Positive_Money_Flow_Sum <= 353979 )
							if( Positive_Money_Flow_Sum <= 241768 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 241768 )
								ret := -0.647059
						if( Positive_Money_Flow_Sum > 353979 )
							if( Negative_Money_Flow_Sum <= 2.86543e+08 )
								if( Positive_Money_Flow <= 11318.2 )
									ret := -0.368421
								if( Positive_Money_Flow > 11318.2 )
									ret := 0.065421
							if( Negative_Money_Flow_Sum > 2.86543e+08 )
								if( MFI <= 16.529 )
									ret := -0.945946 // sell
								if( MFI > 16.529 )
									ret := 0.000000
		if( Negative_Money_Flow > 3.61107e+06 )
			if( MFI <= 48.4675 )
				if( Negative_Money_Flow <= 7.06791e+06 )
					if( Money_Flow_Ratio <= 0.591497 )
						if( Money_Flow_Ratio <= 0.581832 )
							if( MFI <= 35.192 )
								if( Negative_Money_Flow_Sum <= 1.56165e+07 )
									ret := 0.777778 // buy
								if( Negative_Money_Flow_Sum > 1.56165e+07 )
									ret := 0.081402
							if( MFI > 35.192 )
								if( Negative_Money_Flow_Sum <= 4.70612e+07 )
									ret := 0.168919
								if( Negative_Money_Flow_Sum > 4.70612e+07 )
									ret := -0.421687
						if( Money_Flow_Ratio > 0.581832 )
							if( MFI_High <= -43.1585 )
								if( Negative_Money_Flow_Sum <= 4.16747e+07 )
									ret := 0.700000 // buy
								if( Negative_Money_Flow_Sum > 4.16747e+07 )
									ret := 1.000000 // buy
							if( MFI_High > -43.1585 )
								if( MFI_High <= -43.0628 )
									ret := 0.137931
								if( MFI_High > -43.0628 )
									ret := 0.555556
					if( Money_Flow_Ratio > 0.591497 )
						if( MFI <= 39.7547 )
							if( Positive_Money_Flow_Sum <= 1.52736e+07 )
								if( Positive_Money_Flow_Sum <= 1.21727e+07 )
									ret := 0.875000 // buy
								if( Positive_Money_Flow_Sum > 1.21727e+07 )
									ret := 0.128205
							if( Positive_Money_Flow_Sum > 1.52736e+07 )
								if( Money_Flow_Ratio <= 0.62299 )
									ret := -0.236066
								if( Money_Flow_Ratio > 0.62299 )
									ret := -0.439169
						if( MFI > 39.7547 )
							if( MFI_Low <= 26.803 )
								if( MFI_Low <= 26.6523 )
									ret := -0.006993
								if( MFI_Low > 26.6523 )
									ret := 0.529412
							if( MFI_Low > 26.803 )
								if( MFI_Low <= 27.7323 )
									ret := -0.312057
								if( MFI_Low > 27.7323 )
									ret := -0.021739
				if( Negative_Money_Flow > 7.06791e+06 )
					if( Money_Flow_Ratio <= 0.271842 )
						if( MFI_Low <= -13.7336 )
							if( Positive_Money_Flow_Sum <= 8.55122e+06 )
								if( Typical_Price <= 172.621 )
									ret := 0.287129
								if( Typical_Price > 172.621 )
									ret := -0.367816
							if( Positive_Money_Flow_Sum > 8.55122e+06 )
								if( MFI <= 5.26547 )
									ret := 0.562500
								if( MFI > 5.26547 )
									ret := 0.941176 // buy
						if( MFI_Low > -13.7336 )
							if( Raw_Money_Flow <= 1.12155e+07 )
								if( Negative_Money_Flow_Sum <= 6.91089e+07 )
									ret := -0.151515
								if( Negative_Money_Flow_Sum > 6.91089e+07 )
									ret := 0.246851
							if( Raw_Money_Flow > 1.12155e+07 )
								if( Raw_Money_Flow <= 1.6939e+07 )
									ret := -0.252841
								if( Raw_Money_Flow > 1.6939e+07 )
									ret := -0.006036
					if( Money_Flow_Ratio > 0.271842 )
						if( MFI_High <= -54.3253 )
							if( Negative_Money_Flow_Sum <= 3.93171e+08 )
								if( Positive_Money_Flow_Sum <= 3.23755e+07 )
									ret := -0.233216
								if( Positive_Money_Flow_Sum > 3.23755e+07 )
									ret := -0.653125
							if( Negative_Money_Flow_Sum > 3.93171e+08 )
								ret := 0.722222 // buy
						if( MFI_High > -54.3253 )
							if( Raw_Money_Flow <= 8.53855e+06 )
								if( Raw_Money_Flow <= 8.35836e+06 )
									ret := -0.157016
								if( Raw_Money_Flow > 8.35836e+06 )
									ret := -0.555556
							if( Raw_Money_Flow > 8.53855e+06 )
								if( Negative_Money_Flow <= 1.34933e+07 )
									ret := 0.040431
								if( Negative_Money_Flow > 1.34933e+07 )
									ret := -0.161826
			if( MFI > 48.4675 )
				if( MFI_High <= -25.5676 )
					if( MFI <= 50.9659 )
						if( Negative_Money_Flow_Sum <= 1.26263e+08 )
							if( Positive_Money_Flow_Sum <= 7.70867e+07 )
								if( Negative_Money_Flow <= 5.2514e+06 )
									ret := -0.198225
								if( Negative_Money_Flow > 5.2514e+06 )
									ret := 0.161074
							if( Positive_Money_Flow_Sum > 7.70867e+07 )
								if( Positive_Money_Flow_Sum <= 1.04265e+08 )
									ret := -0.826923 // sell
								if( Positive_Money_Flow_Sum > 1.04265e+08 )
									ret := 0.208333
						if( Negative_Money_Flow_Sum > 1.26263e+08 )
							if( Negative_Money_Flow_Sum <= 1.32633e+08 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.32633e+08 )
								if( Typical_Price <= 171.724 )
									ret := 0.833333 // buy
								if( Typical_Price > 171.724 )
									ret := -0.250000
					if( MFI > 50.9659 )
						if( Negative_Money_Flow_Sum <= 4.12173e+07 )
							if( Raw_Money_Flow <= 6.67557e+06 )
								if( Raw_Money_Flow <= 6.11755e+06 )
									ret := 0.278132
								if( Raw_Money_Flow > 6.11755e+06 )
									ret := -0.444444
							if( Raw_Money_Flow > 6.67557e+06 )
								if( MFI_Low <= 31.6719 )
									ret := 0.965517 // buy
								if( MFI_Low > 31.6719 )
									ret := 0.625000
						if( Negative_Money_Flow_Sum > 4.12173e+07 )
							if( Typical_Price <= 178.143 )
								if( Positive_Money_Flow_Sum <= 5.05736e+07 )
									ret := -0.593750
								if( Positive_Money_Flow_Sum > 5.05736e+07 )
									ret := 0.071274
							if( Typical_Price > 178.143 )
								if( Positive_Money_Flow_Sum <= 8.83987e+07 )
									ret := 0.233766
								if( Positive_Money_Flow_Sum > 8.83987e+07 )
									ret := 0.882353 // buy
				if( MFI_High > -25.5676 )
					if( Negative_Money_Flow_Sum <= 1.1866e+08 )
						if( Positive_Money_Flow_Sum <= 2.55003e+08 )
							if( MFI <= 57.7523 )
								if( Positive_Money_Flow_Sum <= 1.11668e+08 )
									ret := -0.099656
								if( Positive_Money_Flow_Sum > 1.11668e+08 )
									ret := -0.583333
							if( MFI > 57.7523 )
								if( MFI_Low <= 42.3272 )
									ret := 0.140845
								if( MFI_Low > 42.3272 )
									ret := -0.006085
						if( Positive_Money_Flow_Sum > 2.55003e+08 )
							if( Raw_Money_Flow <= 1.36529e+07 )
								if( Negative_Money_Flow <= 4.53755e+06 )
									ret := 0.250000
								if( Negative_Money_Flow > 4.53755e+06 )
									ret := -0.597222
							if( Raw_Money_Flow > 1.36529e+07 )
								if( Raw_Money_Flow <= 2.22771e+07 )
									ret := 0.311475
								if( Raw_Money_Flow > 2.22771e+07 )
									ret := -0.320000
					if( Negative_Money_Flow_Sum > 1.1866e+08 )
						if( Negative_Money_Flow_Sum <= 1.63152e+08 )
							if( MFI_High <= 3.62997 )
								if( Positive_Money_Flow_Sum <= 6.13931e+08 )
									ret := 0.450704
								if( Positive_Money_Flow_Sum > 6.13931e+08 )
									ret := 0.947368 // buy
							if( MFI_High > 3.62997 )
								if( Money_Flow_Ratio <= 5.57943 )
									ret := 0.800000 // buy
								if( Money_Flow_Ratio > 5.57943 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 1.63152e+08 )
							if( Typical_Price <= 164.777 )
								if( Negative_Money_Flow <= 2.10301e+07 )
									ret := 0.454545
								if( Negative_Money_Flow > 2.10301e+07 )
									ret := 0.850000 // buy
							if( Typical_Price > 164.777 )
								if( Negative_Money_Flow <= 1.05807e+07 )
									ret := -0.789474 // sell
								if( Negative_Money_Flow > 1.05807e+07 )
									ret := -0.200000
	
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
float op_operation = decision_tree_0_GOOG_1Min_eafbe196(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


