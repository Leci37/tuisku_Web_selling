//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: TSLA_5Min_2CM0_bd67d200 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_5Min_2CM0_bd67d200", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_5Min_bd67d200(ad_mf, mf, ad, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Positive_Money_Flow_Sum <= 5.70348e+07 )
		if( Raw_Money_Flow <= 2.18762e+06 )
			if( Negative_Money_Flow_Sum <= 3.70203e+06 )
				if( Money_Flow_Ratio <= 2.2553 )
					if( MFI_Low <= 47.996 )
						if( Raw_Money_Flow <= 593467 )
							if( Negative_Money_Flow_Sum <= 3.39477e+06 )
								if( Positive_Money_Flow_Sum <= 5.75576e+06 )
									ret := 0.035088
								if( Positive_Money_Flow_Sum > 5.75576e+06 )
									ret := 0.454545
							if( Negative_Money_Flow_Sum > 3.39477e+06 )
								if( mf <= -0.139833 )
									ret := 0.000000
								if( mf > -0.139833 )
									ret := 0.596154
						if( Raw_Money_Flow > 593467 )
							if( MFI_Low <= 40.5245 )
								if( Negative_Money_Flow_Sum <= 3.44342e+06 )
									ret := -0.172414
								if( Negative_Money_Flow_Sum > 3.44342e+06 )
									ret := -0.722222 // sell
							if( MFI_Low > 40.5245 )
								if( Positive_Money_Flow_Sum <= 5.91073e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 5.91073e+06 )
									ret := -0.222222
					if( MFI_Low > 47.996 )
						ret := -0.500000
				if( Money_Flow_Ratio > 2.2553 )
					if( ad <= 6541.79 )
						if( mf <= 0.274065 )
							if( Typical_Price <= 206.596 )
								if( ad_mf <= 1865.97 )
									ret := 0.030769
								if( ad_mf > 1865.97 )
									ret := -0.254902
							if( Typical_Price > 206.596 )
								if( Typical_Price <= 237.807 )
									ret := 0.586207
								if( Typical_Price > 237.807 )
									ret := 0.035714
						if( mf > 0.274065 )
							if( Positive_Money_Flow <= 374992 )
								if( MFI <= 75.2057 )
									ret := 0.454545
								if( MFI > 75.2057 )
									ret := 0.058824
							if( Positive_Money_Flow > 374992 )
								if( mf <= 0.344752 )
									ret := 0.761905 // buy
								if( mf > 0.344752 )
									ret := 0.294118
					if( ad > 6541.79 )
						if( ad_mf <= 7033.87 )
							ret := 0.833333 // buy
						if( ad_mf > 7033.87 )
							if( Negative_Money_Flow_Sum <= 2.16645e+06 )
								if( mf <= 0.293889 )
									ret := 0.777778 // buy
								if( mf > 0.293889 )
									ret := 0.222222
							if( Negative_Money_Flow_Sum > 2.16645e+06 )
								if( Positive_Money_Flow_Sum <= 1.38269e+07 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 1.38269e+07 )
									ret := 0.181818
			if( Negative_Money_Flow_Sum > 3.70203e+06 )
				if( mf <= -0.082056 )
					if( Positive_Money_Flow_Sum <= 9.32387e+06 )
						if( Negative_Money_Flow_Sum <= 2.39768e+07 )
							if( Negative_Money_Flow_Sum <= 6.23278e+06 )
								if( ad <= -7028.59 )
									ret := 0.571429
								if( ad > -7028.59 )
									ret := -0.139785
							if( Negative_Money_Flow_Sum > 6.23278e+06 )
								if( Positive_Money_Flow_Sum <= 9.16265e+06 )
									ret := 0.054426
								if( Positive_Money_Flow_Sum > 9.16265e+06 )
									ret := -0.325000
						if( Negative_Money_Flow_Sum > 2.39768e+07 )
							if( MFI <= 23.3191 )
								if( MFI <= 16.3705 )
									ret := -0.310000
								if( MFI > 16.3705 )
									ret := 0.024390
							if( MFI > 23.3191 )
								if( Raw_Money_Flow <= 912961 )
									ret := -0.894737 // sell
								if( Raw_Money_Flow > 912961 )
									ret := -0.625000
					if( Positive_Money_Flow_Sum > 9.32387e+06 )
						if( mf <= -0.099394 )
							if( Typical_Price <= 248.975 )
								if( Typical_Price <= 178.453 )
									ret := -0.004211
								if( Typical_Price > 178.453 )
									ret := 0.120158
							if( Typical_Price > 248.975 )
								if( MFI_High <= -38.3583 )
									ret := 0.053476
								if( MFI_High > -38.3583 )
									ret := -0.090909
						if( mf > -0.099394 )
							if( ad_mf <= -6523.16 )
								ret := -0.222222
							if( ad_mf > -6523.16 )
								if( ad <= -5622.12 )
									ret := 0.823529 // buy
								if( ad > -5622.12 )
									ret := 0.268156
				if( mf > -0.082056 )
					if( Negative_Money_Flow_Sum <= 2.78574e+07 )
						if( Positive_Money_Flow_Sum <= 2.43874e+07 )
							if( Money_Flow_Ratio <= 0.361436 )
								if( MFI_High <= -54.1502 )
									ret := -0.105660
								if( MFI_High > -54.1502 )
									ret := -0.444444
							if( Money_Flow_Ratio > 0.361436 )
								if( Typical_Price <= 205.236 )
									ret := -0.054767
								if( Typical_Price > 205.236 )
									ret := 0.044467
						if( Positive_Money_Flow_Sum > 2.43874e+07 )
							if( mf <= 0.28277 )
								if( mf <= 0.063398 )
									ret := -0.072555
								if( mf > 0.063398 )
									ret := -0.336601
							if( mf > 0.28277 )
								if( Raw_Money_Flow <= 1.86489e+06 )
									ret := -0.066327
								if( Raw_Money_Flow > 1.86489e+06 )
									ret := 0.246377
					if( Negative_Money_Flow_Sum > 2.78574e+07 )
						if( MFI_Low <= 31.5697 )
							if( MFI <= 28.1391 )
								if( MFI_High <= -53.045 )
									ret := 0.076923
								if( MFI_High > -53.045 )
									ret := -0.352941
							if( MFI > 28.1391 )
								if( Negative_Money_Flow <= 2.13941e+06 )
									ret := 0.201550
								if( Negative_Money_Flow > 2.13941e+06 )
									ret := -0.357143
						if( MFI_Low > 31.5697 )
							if( Negative_Money_Flow <= 2.05376e+06 )
								if( Negative_Money_Flow_Sum <= 2.91752e+07 )
									ret := -0.280000
								if( Negative_Money_Flow_Sum > 2.91752e+07 )
									ret := 0.076923
							if( Negative_Money_Flow > 2.05376e+06 )
								ret := -0.375000
		if( Raw_Money_Flow > 2.18762e+06 )
			if( MFI_Low <= -17.3174 )
				if( MFI <= 0.55798 )
					ret := 0.687500
				if( MFI > 0.55798 )
					if( Money_Flow_Ratio <= 0.025594 )
						if( Raw_Money_Flow <= 7.07429e+08 )
							if( ad_mf <= -1.30015e+06 )
								if( Money_Flow_Ratio <= 0.009399 )
									ret := -0.869565 // sell
								if( Money_Flow_Ratio > 0.009399 )
									ret := -0.047619
							if( ad_mf > -1.30015e+06 )
								if( MFI_High <= -78.9908 )
									ret := 0.414634
								if( MFI_High > -78.9908 )
									ret := -0.110092
						if( Raw_Money_Flow > 7.07429e+08 )
							if( Typical_Price <= 236.917 )
								ret := -0.100000
							if( Typical_Price > 236.917 )
								if( Positive_Money_Flow_Sum <= 4.53761e+07 )
									ret := -0.666667
								if( Positive_Money_Flow_Sum > 4.53761e+07 )
									ret := -1.000000 // sell
					if( Money_Flow_Ratio > 0.025594 )
						if( Raw_Money_Flow <= 3.73483e+08 )
							ret := -0.333333
						if( Raw_Money_Flow > 3.73483e+08 )
							ret := -1.000000 // sell
			if( MFI_Low > -17.3174 )
				if( ad_mf <= -1.95476e+06 )
					if( Money_Flow_Ratio <= 0.05207 )
						if( Raw_Money_Flow <= 7.57263e+08 )
							ret := 0.857143 // buy
						if( Raw_Money_Flow > 7.57263e+08 )
							ret := 0.200000
					if( Money_Flow_Ratio > 0.05207 )
						if( MFI_High <= -74.2184 )
							ret := 1.000000 // buy
						if( MFI_High > -74.2184 )
							ret := 0.625000
				if( ad_mf > -1.95476e+06 )
					if( MFI <= 18.6256 )
						if( MFI_Low <= -7.47213 )
							if( Typical_Price <= 174.896 )
								if( MFI_Low <= -16.8451 )
									ret := 0.375000
								if( MFI_Low > -16.8451 )
									ret := -0.518519
							if( Typical_Price > 174.896 )
								if( ad <= 7591.4 )
									ret := -0.045929
								if( ad > 7591.4 )
									ret := 0.450820
						if( MFI_Low > -7.47213 )
							if( Negative_Money_Flow <= 3.48955e+07 )
								if( Typical_Price <= 151.401 )
									ret := -0.333333
								if( Typical_Price > 151.401 )
									ret := 0.287244
							if( Negative_Money_Flow > 3.48955e+07 )
								if( MFI_Low <= -4.22995 )
									ret := 0.307692
								if( MFI_Low > -4.22995 )
									ret := -0.533333
					if( MFI > 18.6256 )
						if( MFI <= 19.4415 )
							if( mf <= -0.125051 )
								if( Negative_Money_Flow <= 1.25298e+07 )
									ret := -0.247706
								if( Negative_Money_Flow > 1.25298e+07 )
									ret := -0.821429 // sell
							if( mf > -0.125051 )
								if( Positive_Money_Flow_Sum <= 4.47113e+07 )
									ret := -0.126984
								if( Positive_Money_Flow_Sum > 4.47113e+07 )
									ret := 0.750000 // buy
						if( MFI > 19.4415 )
							if( Typical_Price <= 216.074 )
								if( Typical_Price <= 197.185 )
									ret := 0.064405
								if( Typical_Price > 197.185 )
									ret := 0.160541
							if( Typical_Price > 216.074 )
								if( Positive_Money_Flow <= 9.93226e+06 )
									ret := 0.031879
								if( Positive_Money_Flow > 9.93226e+06 )
									ret := 0.236398
	if( Positive_Money_Flow_Sum > 5.70348e+07 )
		if( Typical_Price <= 256.373 )
			if( ad_mf <= 1.52338e+06 )
				if( Money_Flow_Ratio <= 328.734 )
					if( Negative_Money_Flow_Sum <= 5.01387e+09 )
						if( MFI <= 18.648 )
							if( Typical_Price <= 214.361 )
								if( Positive_Money_Flow_Sum <= 7.32721e+08 )
									ret := 0.019928
								if( Positive_Money_Flow_Sum > 7.32721e+08 )
									ret := 0.564516
							if( Typical_Price > 214.361 )
								if( Negative_Money_Flow <= 9.71543e+08 )
									ret := -0.287356
								if( Negative_Money_Flow > 9.71543e+08 )
									ret := 0.235849
						if( MFI > 18.648 )
							if( Positive_Money_Flow_Sum <= 4.26157e+09 )
								if( Negative_Money_Flow_Sum <= 2.08673e+09 )
									ret := -0.008528
								if( Negative_Money_Flow_Sum > 2.08673e+09 )
									ret := -0.080952
							if( Positive_Money_Flow_Sum > 4.26157e+09 )
								if( Money_Flow_Ratio <= 1.78923 )
									ret := 0.392465
								if( Money_Flow_Ratio > 1.78923 )
									ret := 0.021605
					if( Negative_Money_Flow_Sum > 5.01387e+09 )
						if( Positive_Money_Flow_Sum <= 3.10746e+08 )
							if( Raw_Money_Flow <= 7.5289e+08 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 7.5289e+08 )
								ret := -0.600000
						if( Positive_Money_Flow_Sum > 3.10746e+08 )
							if( Positive_Money_Flow_Sum <= 1.44228e+09 )
								if( MFI <= 10.5636 )
									ret := 0.225352
								if( MFI > 10.5636 )
									ret := 0.688623
							if( Positive_Money_Flow_Sum > 1.44228e+09 )
								if( Negative_Money_Flow_Sum <= 5.1019e+09 )
									ret := 0.627451
								if( Negative_Money_Flow_Sum > 5.1019e+09 )
									ret := 0.062580
				if( Money_Flow_Ratio > 328.734 )
					ret := 1.000000 // buy
			if( ad_mf > 1.52338e+06 )
				if( MFI_High <= -22.3586 )
					if( Negative_Money_Flow_Sum <= 9.05226e+08 )
						if( ad_mf <= 2.22996e+06 )
							ret := 0.200000
						if( ad_mf > 2.22996e+06 )
							ret := -0.913043 // sell
					if( Negative_Money_Flow_Sum > 9.05226e+08 )
						if( MFI <= 45.7428 )
							if( MFI_Low <= 21.9415 )
								if( MFI_Low <= 19.6356 )
									ret := 0.228070
								if( MFI_Low > 19.6356 )
									ret := 0.652778
							if( MFI_Low > 21.9415 )
								if( Typical_Price <= 240.276 )
									ret := -0.469697
								if( Typical_Price > 240.276 )
									ret := 0.088235
						if( MFI > 45.7428 )
							if( Raw_Money_Flow <= 9.33882e+08 )
								if( Negative_Money_Flow_Sum <= 3.47371e+09 )
									ret := 0.732984 // buy
								if( Negative_Money_Flow_Sum > 3.47371e+09 )
									ret := 0.259259
							if( Raw_Money_Flow > 9.33882e+08 )
								ret := -1.000000 // sell
				if( MFI_High > -22.3586 )
					if( Positive_Money_Flow_Sum <= 1.62983e+09 )
						if( Money_Flow_Ratio <= 2.08448 )
							ret := 0.944444 // buy
						if( Money_Flow_Ratio > 2.08448 )
							if( Positive_Money_Flow_Sum <= 1.24451e+09 )
								if( Positive_Money_Flow <= 7.90069e+08 )
									ret := 0.436364
								if( Positive_Money_Flow > 7.90069e+08 )
									ret := -0.097561
							if( Positive_Money_Flow_Sum > 1.24451e+09 )
								if( ad <= 1.81379e+06 )
									ret := 0.000000
								if( ad > 1.81379e+06 )
									ret := 0.917647 // buy
					if( Positive_Money_Flow_Sum > 1.62983e+09 )
						if( ad <= 2.57525e+06 )
							if( MFI_Low <= 67.9131 )
								if( Money_Flow_Ratio <= 5.72056 )
									ret := 0.051667
								if( Money_Flow_Ratio > 5.72056 )
									ret := -0.916667 // sell
							if( MFI_Low > 67.9131 )
								if( MFI <= 97.7284 )
									ret := 0.610000
								if( MFI > 97.7284 )
									ret := -0.444444
						if( ad > 2.57525e+06 )
							if( Raw_Money_Flow <= 7.41856e+08 )
								if( Typical_Price <= 214.504 )
									ret := -0.426829
								if( Typical_Price > 214.504 )
									ret := -0.840000 // sell
							if( Raw_Money_Flow > 7.41856e+08 )
								if( Positive_Money_Flow_Sum <= 5.37112e+09 )
									ret := -0.221239
								if( Positive_Money_Flow_Sum > 5.37112e+09 )
									ret := 0.490566
		if( Typical_Price > 256.373 )
			if( Raw_Money_Flow <= 4.13971e+08 )
				if( Money_Flow_Ratio <= 0.434259 )
					if( Raw_Money_Flow <= 3.34343e+08 )
						if( Raw_Money_Flow <= 2.09493e+07 )
							if( Raw_Money_Flow <= 1.99398e+07 )
								if( MFI_Low <= 8.44116 )
									ret := -0.018018
								if( MFI_Low > 8.44116 )
									ret := -0.500000
							if( Raw_Money_Flow > 1.99398e+07 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 2.09493e+07 )
							if( Raw_Money_Flow <= 2.52452e+08 )
								if( MFI_Low <= 1.92367 )
									ret := -0.812081 // sell
								if( MFI_Low > 1.92367 )
									ret := -0.435115
							if( Raw_Money_Flow > 2.52452e+08 )
								if( ad <= -611191 )
									ret := 0.153846
								if( ad > -611191 )
									ret := -0.437500
					if( Raw_Money_Flow > 3.34343e+08 )
						if( Negative_Money_Flow <= 3.87234e+08 )
							if( Negative_Money_Flow_Sum <= 3.76943e+09 )
								if( Positive_Money_Flow_Sum <= 1.26935e+09 )
									ret := 0.166667
								if( Positive_Money_Flow_Sum > 1.26935e+09 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 3.76943e+09 )
								if( Money_Flow_Ratio <= 0.348167 )
									ret := 0.800000 // buy
								if( Money_Flow_Ratio > 0.348167 )
									ret := -0.307692
						if( Negative_Money_Flow > 3.87234e+08 )
							if( mf <= -0.179133 )
								ret := 0.166667
							if( mf > -0.179133 )
								if( Negative_Money_Flow_Sum <= 4.61632e+09 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 4.61632e+09 )
									ret := -0.545455
				if( Money_Flow_Ratio > 0.434259 )
					if( Raw_Money_Flow <= 2.33451e+08 )
						if( Typical_Price <= 281.354 )
							if( Positive_Money_Flow <= 4.64989e+07 )
								if( ad_mf <= -81029.5 )
									ret := 0.164596
								if( ad_mf > -81029.5 )
									ret := -0.078838
							if( Positive_Money_Flow > 4.64989e+07 )
								if( MFI <= 90.8904 )
									ret := -0.292308
								if( MFI > 90.8904 )
									ret := 0.533333
						if( Typical_Price > 281.354 )
							if( Negative_Money_Flow <= 2.86839e+07 )
								if( Negative_Money_Flow_Sum <= 1.36368e+09 )
									ret := 0.106557
								if( Negative_Money_Flow_Sum > 1.36368e+09 )
									ret := -0.450000
							if( Negative_Money_Flow > 2.86839e+07 )
								ret := 0.739130 // buy
					if( Raw_Money_Flow > 2.33451e+08 )
						if( Negative_Money_Flow_Sum <= 3.30163e+09 )
							if( Negative_Money_Flow_Sum <= 2.99791e+09 )
								if( mf <= -0.080196 )
									ret := -0.439394
								if( mf > -0.080196 )
									ret := 0.067961
							if( Negative_Money_Flow_Sum > 2.99791e+09 )
								if( MFI_Low <= 37.6988 )
									ret := 0.587065
								if( MFI_Low > 37.6988 )
									ret := -0.391304
						if( Negative_Money_Flow_Sum > 3.30163e+09 )
							if( Negative_Money_Flow_Sum <= 4.26361e+09 )
								if( Raw_Money_Flow <= 3.27914e+08 )
									ret := -0.017857
								if( Raw_Money_Flow > 3.27914e+08 )
									ret := -0.502591
							if( Negative_Money_Flow_Sum > 4.26361e+09 )
								if( Positive_Money_Flow_Sum <= 3.49836e+09 )
									ret := 0.064516
								if( Positive_Money_Flow_Sum > 3.49836e+09 )
									ret := 0.653061
			if( Raw_Money_Flow > 4.13971e+08 )
				if( ad_mf <= -1.5561e+06 )
					if( MFI_High <= -19.0241 )
						if( Raw_Money_Flow <= 1.38591e+09 )
							if( MFI_Low <= -14.6194 )
								ret := -1.000000 // sell
							if( MFI_Low > -14.6194 )
								if( mf <= -0.32329 )
									ret := 0.959184 // buy
								if( mf > -0.32329 )
									ret := 0.161538
						if( Raw_Money_Flow > 1.38591e+09 )
							ret := -0.647059
					if( MFI_High > -19.0241 )
						if( Positive_Money_Flow_Sum <= 2.44308e+09 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 2.44308e+09 )
							if( Negative_Money_Flow_Sum <= 3.15989e+09 )
								if( Positive_Money_Flow <= 6.24967e+08 )
									ret := 0.685714
								if( Positive_Money_Flow > 6.24967e+08 )
									ret := -0.576923
							if( Negative_Money_Flow_Sum > 3.15989e+09 )
								ret := -0.750000 // sell
				if( ad_mf > -1.5561e+06 )
					if( Typical_Price <= 273.394 )
						if( Negative_Money_Flow_Sum <= 5.94424e+09 )
							if( Negative_Money_Flow_Sum <= 5.36231e+09 )
								if( Positive_Money_Flow_Sum <= 8.77888e+09 )
									ret := -0.153107
								if( Positive_Money_Flow_Sum > 8.77888e+09 )
									ret := -0.864865 // sell
							if( Negative_Money_Flow_Sum > 5.36231e+09 )
								if( mf <= 0.044887 )
									ret := 0.568627
								if( mf > 0.044887 )
									ret := -0.285714
						if( Negative_Money_Flow_Sum > 5.94424e+09 )
							if( Positive_Money_Flow_Sum <= 3.30402e+09 )
								if( MFI <= 20.2271 )
									ret := 0.416667
								if( MFI > 20.2271 )
									ret := -0.333333
							if( Positive_Money_Flow_Sum > 3.30402e+09 )
								if( Negative_Money_Flow <= 7.46641e+08 )
									ret := -0.953846 // sell
								if( Negative_Money_Flow > 7.46641e+08 )
									ret := -0.800000 // sell
					if( Typical_Price > 273.394 )
						if( Raw_Money_Flow <= 6.01811e+08 )
							if( MFI <= 40.3644 )
								if( mf <= -0.050675 )
									ret := 0.888889 // buy
								if( mf > -0.050675 )
									ret := -0.407407
							if( MFI > 40.3644 )
								if( Raw_Money_Flow <= 4.52714e+08 )
									ret := -0.120000
								if( Raw_Money_Flow > 4.52714e+08 )
									ret := -0.533981
						if( Raw_Money_Flow > 6.01811e+08 )
							if( Positive_Money_Flow_Sum <= 3.79907e+09 )
								if( MFI_High <= -17.091 )
									ret := -0.590164
								if( MFI_High > -17.091 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 3.79907e+09 )
								if( MFI <= 68.6794 )
									ret := -0.877193 // sell
								if( MFI > 68.6794 )
									ret := -0.707317 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_TSLA_5Min_bd67d200(ad_mf, mf, ad, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


