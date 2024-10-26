//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Money_Flow_Index
// ID_model: GME_15Min_2BM0_0c74c986 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_15Min_2BM0_0c74c986", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_15Min_0c74c986(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= 0.093884 )
		if( Raw_Money_Flow <= 56561.5 )
			if( Typical_Price <= 4.38229 )
				if( Positive_Money_Flow_Sum <= 876104 )
					if( Positive_Money_Flow <= 380.632 )
						if( Negative_Money_Flow_Sum <= 4.12293e+06 )
							if( MFI_Low <= 1.03378 )
								if( bbm <= 0.031243 )
									ret := 0.039474
								if( bbm > 0.031243 )
									ret := -0.782609 // sell
							if( MFI_Low > 1.03378 )
								if( Money_Flow_Ratio <= 1.47436 )
									ret := 0.366667
								if( Money_Flow_Ratio > 1.47436 )
									ret := -0.363636
						if( Negative_Money_Flow_Sum > 4.12293e+06 )
							if( MFI_High <= -73.6092 )
								ret := 0.600000
							if( MFI_High > -73.6092 )
								ret := 0.916667 // buy
					if( Positive_Money_Flow > 380.632 )
						if( bullPower <= -0.032903 )
							ret := 0.454545
						if( bullPower > -0.032903 )
							if( Positive_Money_Flow_Sum <= 227973 )
								if( Positive_Money_Flow <= 11514.3 )
									ret := -0.891304 // sell
								if( Positive_Money_Flow > 11514.3 )
									ret := -0.500000
							if( Positive_Money_Flow_Sum > 227973 )
								if( bbm <= 0.001588 )
									ret := -0.771429 // sell
								if( bbm > 0.001588 )
									ret := 0.138889
				if( Positive_Money_Flow_Sum > 876104 )
					if( Typical_Price <= 3.36178 )
						if( MFI_High <= -30.3378 )
							if( MFI_High <= -37.6716 )
								ret := 0.900000 // buy
							if( MFI_High > -37.6716 )
								ret := 0.400000
						if( MFI_High > -30.3378 )
							if( bullPower <= 0.033034 )
								ret := 1.000000 // buy
							if( bullPower > 0.033034 )
								ret := 0.900000 // buy
					if( Typical_Price > 3.36178 )
						if( Negative_Money_Flow_Sum <= 6.80417e+06 )
							if( Typical_Price <= 4.29983 )
								if( Negative_Money_Flow_Sum <= 3.7334e+06 )
									ret := 0.224080
								if( Negative_Money_Flow_Sum > 3.7334e+06 )
									ret := 0.564103
							if( Typical_Price > 4.29983 )
								if( MFI <= 71.0248 )
									ret := 0.817073 // buy
								if( MFI > 71.0248 )
									ret := 0.333333
						if( Negative_Money_Flow_Sum > 6.80417e+06 )
							if( Typical_Price <= 4.22074 )
								if( bearPower <= 0.000384 )
									ret := 0.423729
								if( bearPower > 0.000384 )
									ret := -0.360000
							if( Typical_Price > 4.22074 )
								if( Negative_Money_Flow_Sum <= 9.82917e+06 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 9.82917e+06 )
									ret := -0.130435
			if( Typical_Price > 4.38229 )
				if( Positive_Money_Flow <= 2636.89 )
					if( bearPower <= -0.012197 )
						if( Positive_Money_Flow_Sum <= 829607 )
							if( MFI_High <= -27.3858 )
								if( Positive_Money_Flow_Sum <= 27357.8 )
									ret := -0.404762
								if( Positive_Money_Flow_Sum > 27357.8 )
									ret := 0.186796
							if( MFI_High > -27.3858 )
								if( Raw_Money_Flow <= 10575.5 )
									ret := 0.222222
								if( Raw_Money_Flow > 10575.5 )
									ret := -0.179541
						if( Positive_Money_Flow_Sum > 829607 )
							if( Raw_Money_Flow <= 1809.25 )
								if( MFI <= 22.8869 )
									ret := -0.086957
								if( MFI > 22.8869 )
									ret := 0.633987
							if( Raw_Money_Flow > 1809.25 )
								if( bearPower <= -0.10101 )
									ret := 0.373255
								if( bearPower > -0.10101 )
									ret := 0.195503
					if( bearPower > -0.012197 )
						if( Negative_Money_Flow_Sum <= 240094 )
							if( bullPower <= 0.010121 )
								if( Raw_Money_Flow <= 7777.9 )
									ret := 0.121739
								if( Raw_Money_Flow > 7777.9 )
									ret := -0.343284
							if( bullPower > 0.010121 )
								if( Positive_Money_Flow_Sum <= 18371.2 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 18371.2 )
									ret := -0.291284
						if( Negative_Money_Flow_Sum > 240094 )
							if( Negative_Money_Flow_Sum <= 3.79934e+07 )
								if( Typical_Price <= 4.41168 )
									ret := -1.000000 // sell
								if( Typical_Price > 4.41168 )
									ret := 0.011871
							if( Negative_Money_Flow_Sum > 3.79934e+07 )
								ret := 0.884615 // buy
				if( Positive_Money_Flow > 2636.89 )
					if( MFI_High <= -19.187 )
						if( bullPower <= 0.02972 )
							if( bullPower <= -0.074484 )
								if( Typical_Price <= 25.6917 )
									ret := 0.317152
								if( Typical_Price > 25.6917 )
									ret := -0.030864
							if( bullPower > -0.074484 )
								if( MFI_High <= -78.4872 )
									ret := 0.258065
								if( MFI_High > -78.4872 )
									ret := -0.055076
						if( bullPower > 0.02972 )
							if( Money_Flow_Ratio <= 0.019107 )
								if( Negative_Money_Flow <= 456.911 )
									ret := -0.181818
								if( Negative_Money_Flow > 456.911 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 0.019107 )
								if( Positive_Money_Flow <= 16279 )
									ret := -0.322382
								if( Positive_Money_Flow > 16279 )
									ret := -0.159004
					if( MFI_High > -19.187 )
						if( bearPower <= -0.047963 )
							if( bearPower <= -0.81539 )
								if( Typical_Price <= 122.209 )
									ret := 1.000000 // buy
								if( Typical_Price > 122.209 )
									ret := 0.714286 // buy
							if( bearPower > -0.81539 )
								if( MFI_Low <= 76.5745 )
									ret := 0.329268
								if( MFI_Low > 76.5745 )
									ret := -0.150000
						if( bearPower > -0.047963 )
							if( Typical_Price <= 6.2133 )
								if( Money_Flow_Ratio <= 3.87263 )
									ret := 0.635417
								if( Money_Flow_Ratio > 3.87263 )
									ret := -0.205128
							if( Typical_Price > 6.2133 )
								if( bbm <= 0.013899 )
									ret := 0.125000
								if( bbm > 0.013899 )
									ret := -0.143403
		if( Raw_Money_Flow > 56561.5 )
			if( Positive_Money_Flow <= 1.42028e+08 )
				if( Typical_Price <= 9.43495 )
					if( MFI_High <= -4.90773 )
						if( Negative_Money_Flow_Sum <= 3.18991e+06 )
							if( MFI <= 1.8915 )
								if( Negative_Money_Flow_Sum <= 2.81863e+06 )
									ret := -0.823529 // sell
								if( Negative_Money_Flow_Sum > 2.81863e+06 )
									ret := -0.125000
							if( MFI > 1.8915 )
								if( MFI <= 28.2128 )
									ret := -0.103158
								if( MFI > 28.2128 )
									ret := 0.071779
						if( Negative_Money_Flow_Sum > 3.18991e+06 )
							if( Raw_Money_Flow <= 2.49185e+06 )
								if( Positive_Money_Flow_Sum <= 276085 )
									ret := 0.573333
								if( Positive_Money_Flow_Sum > 276085 )
									ret := 0.112529
							if( Raw_Money_Flow > 2.49185e+06 )
								if( MFI_Low <= 36.0365 )
									ret := 0.429889
								if( MFI_Low > 36.0365 )
									ret := -0.121951
					if( MFI_High > -4.90773 )
						if( bullPower <= 0.158197 )
							if( Raw_Money_Flow <= 1.39106e+06 )
								if( Negative_Money_Flow <= 441765 )
									ret := -0.083770
								if( Negative_Money_Flow > 441765 )
									ret := 0.353659
							if( Raw_Money_Flow > 1.39106e+06 )
								if( bearPower <= 0.019647 )
									ret := -0.273973
								if( bearPower > 0.019647 )
									ret := -0.875000 // sell
						if( bullPower > 0.158197 )
							ret := -1.000000 // sell
				if( Typical_Price > 9.43495 )
					if( Positive_Money_Flow_Sum <= 272287 )
						if( MFI_High <= -54.4238 )
							if( Typical_Price <= 65.8865 )
								if( Typical_Price <= 20.725 )
									ret := -0.043820
								if( Typical_Price > 20.725 )
									ret := 0.197143
							if( Typical_Price > 65.8865 )
								if( bbm <= 0.010048 )
									ret := 0.200000
								if( bbm > 0.010048 )
									ret := -0.688312
						if( MFI_High > -54.4238 )
							if( MFI <= 40.8172 )
								if( bbm <= 0.095665 )
									ret := -0.560185
								if( bbm > 0.095665 )
									ret := -0.341667
							if( MFI > 40.8172 )
								if( MFI_High <= -37.5436 )
									ret := 0.472222
								if( MFI_High > -37.5436 )
									ret := -0.264516
					if( Positive_Money_Flow_Sum > 272287 )
						if( bearPower <= -48.4539 )
							if( Negative_Money_Flow_Sum <= 6.93219e+08 )
								ret := 0.545455
							if( Negative_Money_Flow_Sum > 6.93219e+08 )
								if( bbp <= -67.2849 )
									ret := 1.000000 // buy
								if( bbp > -67.2849 )
									ret := 0.750000 // buy
						if( bearPower > -48.4539 )
							if( Negative_Money_Flow_Sum <= 3.90307e+09 )
								if( Negative_Money_Flow <= 2.2251e+07 )
									ret := 0.030459
								if( Negative_Money_Flow > 2.2251e+07 )
									ret := -0.089820
							if( Negative_Money_Flow_Sum > 3.90307e+09 )
								if( Raw_Money_Flow <= 4.14378e+08 )
									ret := 0.923077 // buy
								if( Raw_Money_Flow > 4.14378e+08 )
									ret := 0.047619
			if( Positive_Money_Flow > 1.42028e+08 )
				if( bullPower <= 6.06128 )
					if( Raw_Money_Flow <= 3.9586e+08 )
						if( Negative_Money_Flow_Sum <= 2.56062e+09 )
							if( Positive_Money_Flow <= 1.70477e+08 )
								if( Positive_Money_Flow_Sum <= 4.70776e+08 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 4.70776e+08 )
									ret := 0.238095
							if( Positive_Money_Flow > 1.70477e+08 )
								if( MFI_High <= -53.8831 )
									ret := -0.500000
								if( MFI_High > -53.8831 )
									ret := -0.831325 // sell
						if( Negative_Money_Flow_Sum > 2.56062e+09 )
							if( MFI_Low <= 35.0874 )
								if( Money_Flow_Ratio <= 0.526688 )
									ret := 0.185185
								if( Money_Flow_Ratio > 0.526688 )
									ret := -0.484848
							if( MFI_Low > 35.0874 )
								ret := 1.000000 // buy
					if( Raw_Money_Flow > 3.9586e+08 )
						if( Positive_Money_Flow_Sum <= 9.57605e+09 )
							if( Money_Flow_Ratio <= 0.852213 )
								if( Typical_Price <= 203.595 )
									ret := 0.692308
								if( Typical_Price > 203.595 )
									ret := 1.000000 // buy
							if( Money_Flow_Ratio > 0.852213 )
								if( MFI_High <= -20.5989 )
									ret := -0.100000
								if( MFI_High > -20.5989 )
									ret := 0.538462
						if( Positive_Money_Flow_Sum > 9.57605e+09 )
							ret := -1.000000 // sell
				if( bullPower > 6.06128 )
					if( MFI_High <= -39.2174 )
						ret := -1.000000 // sell
					if( MFI_High > -39.2174 )
						if( bbm <= 18.4736 )
							if( bullPower <= 6.63573 )
								ret := -0.833333 // sell
							if( bullPower > 6.63573 )
								ret := -0.555556
						if( bbm > 18.4736 )
							ret := -0.904762 // sell
	if( bbp > 0.093884 )
		if( bbm <= 1.17589 )
			if( Raw_Money_Flow <= 56174.1 )
				if( Negative_Money_Flow_Sum <= 16861.2 )
					if( MFI <= 60.8145 )
						ret := 1.000000 // buy
					if( MFI > 60.8145 )
						ret := 0.666667
				if( Negative_Money_Flow_Sum > 16861.2 )
					if( Negative_Money_Flow_Sum <= 197140 )
						if( Positive_Money_Flow <= 44.3415 )
							if( bbm <= 0.073863 )
								if( MFI <= 89.4224 )
									ret := -0.267281
								if( MFI > 89.4224 )
									ret := 0.500000
							if( bbm > 0.073863 )
								if( Typical_Price <= 21.0459 )
									ret := 0.385965
								if( Typical_Price > 21.0459 )
									ret := -0.307692
						if( Positive_Money_Flow > 44.3415 )
							if( MFI_High <= -15.0386 )
								if( bullPower <= 0.079078 )
									ret := -0.422222
								if( bullPower > 0.079078 )
									ret := -0.698864
							if( MFI_High > -15.0386 )
								if( Typical_Price <= 7.49101 )
									ret := -0.745763 // sell
								if( Typical_Price > 7.49101 )
									ret := -0.356775
					if( Negative_Money_Flow_Sum > 197140 )
						if( bullPower <= 0.227492 )
							if( Positive_Money_Flow <= 440.19 )
								if( bbp <= 0.192687 )
									ret := 0.105839
								if( bbp > 0.192687 )
									ret := -0.145897
							if( Positive_Money_Flow > 440.19 )
								if( Positive_Money_Flow <= 1686.22 )
									ret := -0.502183
								if( Positive_Money_Flow > 1686.22 )
									ret := -0.231308
						if( bullPower > 0.227492 )
							if( MFI_High <= -39.5147 )
								if( Negative_Money_Flow_Sum <= 5.75082e+07 )
									ret := -0.617857
								if( Negative_Money_Flow_Sum > 5.75082e+07 )
									ret := 0.117647
							if( MFI_High > -39.5147 )
								if( Money_Flow_Ratio <= 4.69379 )
									ret := -0.191919
								if( Money_Flow_Ratio > 4.69379 )
									ret := -0.464286
			if( Raw_Money_Flow > 56174.1 )
				if( Negative_Money_Flow_Sum <= 1.70215e+07 )
					if( MFI_High <= -43.9214 )
						if( MFI <= 7.64656 )
							if( MFI_High <= -73.8581 )
								if( bullPower <= 0.282973 )
									ret := 0.230769
								if( bullPower > 0.282973 )
									ret := -0.600000
							if( MFI_High > -73.8581 )
								ret := 0.722222 // buy
						if( MFI > 7.64656 )
							if( bullPower <= 0.50311 )
								if( Typical_Price <= 189.963 )
									ret := -0.265107
								if( Typical_Price > 189.963 )
									ret := 0.538462
							if( bullPower > 0.50311 )
								if( Positive_Money_Flow_Sum <= 571060 )
									ret := 0.314286
								if( Positive_Money_Flow_Sum > 571060 )
									ret := -0.721393 // sell
					if( MFI_High > -43.9214 )
						if( Raw_Money_Flow <= 8.38487e+06 )
							if( bbm <= 0.110597 )
								if( MFI <= 80.4926 )
									ret := -0.055352
								if( MFI > 80.4926 )
									ret := 0.100131
							if( bbm > 0.110597 )
								if( Positive_Money_Flow_Sum <= 3.81545e+07 )
									ret := -0.169630
								if( Positive_Money_Flow_Sum > 3.81545e+07 )
									ret := 0.105263
						if( Raw_Money_Flow > 8.38487e+06 )
							if( BBPower_Color <= 0.5 )
								if( bullPower <= 0.554643 )
									ret := -0.230769
								if( bullPower > 0.554643 )
									ret := 0.826087 // buy
							if( BBPower_Color > 0.5 )
								if( Positive_Money_Flow_Sum <= 7.28385e+07 )
									ret := -0.150082
								if( Positive_Money_Flow_Sum > 7.28385e+07 )
									ret := -0.776744 // sell
				if( Negative_Money_Flow_Sum > 1.70215e+07 )
					if( MFI_Low <= 62.0088 )
						if( MFI_High <= -4.05339 )
							if( Negative_Money_Flow_Sum <= 2.34754e+08 )
								if( bullPower <= 0.256894 )
									ret := 0.060372
								if( bullPower > 0.256894 )
									ret := -0.050312
							if( Negative_Money_Flow_Sum > 2.34754e+08 )
								if( Money_Flow_Ratio <= 1.22687 )
									ret := 0.353846
								if( Money_Flow_Ratio > 1.22687 )
									ret := -0.006410
						if( MFI_High > -4.05339 )
							if( Positive_Money_Flow_Sum <= 5.3252e+08 )
								if( Positive_Money_Flow <= 2.17724e+07 )
									ret := 0.293461
								if( Positive_Money_Flow > 2.17724e+07 )
									ret := -0.236842
							if( Positive_Money_Flow_Sum > 5.3252e+08 )
								if( Raw_Money_Flow <= 5.56584e+07 )
									ret := 0.897436 // buy
								if( Raw_Money_Flow > 5.56584e+07 )
									ret := 0.636364
					if( MFI_Low > 62.0088 )
						if( bbm <= 1.00708 )
							if( Positive_Money_Flow_Sum <= 9.30464e+07 )
								if( MFI <= 82.5816 )
									ret := -0.090909
								if( MFI > 82.5816 )
									ret := 0.923077 // buy
							if( Positive_Money_Flow_Sum > 9.30464e+07 )
								if( Positive_Money_Flow_Sum <= 2.60152e+08 )
									ret := -0.534314
								if( Positive_Money_Flow_Sum > 2.60152e+08 )
									ret := -0.109195
						if( bbm > 1.00708 )
							if( bearPower <= 0.642182 )
								ret := -0.578947
							if( bearPower > 0.642182 )
								if( Raw_Money_Flow <= 2.22266e+07 )
									ret := 0.304348
								if( Raw_Money_Flow > 2.22266e+07 )
									ret := 1.000000 // buy
		if( bbm > 1.17589 )
			if( MFI_High <= -24.1838 )
				if( Typical_Price <= 321.718 )
					if( Negative_Money_Flow_Sum <= 3.196e+09 )
						if( bullPower <= 4.03179 )
							if( MFI <= 55.4648 )
								if( Positive_Money_Flow_Sum <= 3.56816e+07 )
									ret := -0.202552
								if( Positive_Money_Flow_Sum > 3.56816e+07 )
									ret := 0.075303
							if( MFI > 55.4648 )
								if( Negative_Money_Flow_Sum <= 6.4005e+08 )
									ret := -0.360000
								if( Negative_Money_Flow_Sum > 6.4005e+08 )
									ret := -1.000000 // sell
						if( bullPower > 4.03179 )
							if( bearPower <= 2.34334 )
								if( Negative_Money_Flow_Sum <= 3.86819e+08 )
									ret := -0.575290
								if( Negative_Money_Flow_Sum > 3.86819e+08 )
									ret := -0.235294
							if( bearPower > 2.34334 )
								if( Positive_Money_Flow <= 1.95716e+07 )
									ret := -0.258824
								if( Positive_Money_Flow > 1.95716e+07 )
									ret := 0.611111
					if( Negative_Money_Flow_Sum > 3.196e+09 )
						if( bearPower <= -14.1521 )
							ret := 0.666667
						if( bearPower > -14.1521 )
							if( bbm <= 21.09 )
								ret := 0.875000 // buy
							if( bbm > 21.09 )
								ret := 1.000000 // buy
				if( Typical_Price > 321.718 )
					if( MFI_Low <= 23.306 )
						ret := -0.916667 // sell
					if( MFI_Low > 23.306 )
						ret := -1.000000 // sell
			if( MFI_High > -24.1838 )
				if( Negative_Money_Flow_Sum <= 1.03933e+08 )
					if( Positive_Money_Flow_Sum <= 3.201e+07 )
						if( bearPower <= 2.84499 )
							if( MFI <= 96.8413 )
								if( Negative_Money_Flow_Sum <= 2.58714e+06 )
									ret := -0.095775
								if( Negative_Money_Flow_Sum > 2.58714e+06 )
									ret := -0.426829
							if( MFI > 96.8413 )
								if( bearPower <= -0.592383 )
									ret := -1.000000 // sell
								if( bearPower > -0.592383 )
									ret := -0.646154
						if( bearPower > 2.84499 )
							if( MFI_High <= 5.13182 )
								ret := 0.214286
							if( MFI_High > 5.13182 )
								ret := 1.000000 // buy
					if( Positive_Money_Flow_Sum > 3.201e+07 )
						if( bearPower <= 3.22567 )
							if( MFI <= 76.1703 )
								if( bbm <= 4.51194 )
									ret := -0.015267
								if( bbm > 4.51194 )
									ret := -0.696721
							if( MFI > 76.1703 )
								if( Typical_Price <= 61.0156 )
									ret := -0.107362
								if( Typical_Price > 61.0156 )
									ret := 0.190744
						if( bearPower > 3.22567 )
							if( Typical_Price <= 139.154 )
								if( Typical_Price <= 130.865 )
									ret := -0.250000
								if( Typical_Price > 130.865 )
									ret := 0.600000
							if( Typical_Price > 139.154 )
								if( bullPower <= 6.92111 )
									ret := -0.250000
								if( bullPower > 6.92111 )
									ret := -0.609375
				if( Negative_Money_Flow_Sum > 1.03933e+08 )
					if( Raw_Money_Flow <= 7.52167e+07 )
						if( MFI_High <= -8.16838 )
							if( Negative_Money_Flow <= 7.75069e+06 )
								if( Positive_Money_Flow_Sum <= 7.81982e+08 )
									ret := 0.391831
								if( Positive_Money_Flow_Sum > 7.81982e+08 )
									ret := 0.013889
							if( Negative_Money_Flow > 7.75069e+06 )
								if( bullPower <= 6.12171 )
									ret := 0.088729
								if( bullPower > 6.12171 )
									ret := -0.541667
						if( MFI_High > -8.16838 )
							if( Money_Flow_Ratio <= 2.99153 )
								if( bearPower <= 0.102014 )
									ret := 0.000000
								if( bearPower > 0.102014 )
									ret := 0.807107 // buy
							if( Money_Flow_Ratio > 2.99153 )
								if( Negative_Money_Flow <= 2.66815e+07 )
									ret := 0.118919
								if( Negative_Money_Flow > 2.66815e+07 )
									ret := 0.842857 // buy
					if( Raw_Money_Flow > 7.52167e+07 )
						if( bbm <= 17.0383 )
							if( Positive_Money_Flow_Sum <= 2.28226e+09 )
								if( bearPower <= 0.758636 )
									ret := 0.216599
								if( bearPower > 0.758636 )
									ret := -0.058462
							if( Positive_Money_Flow_Sum > 2.28226e+09 )
								if( bbp <= 22.6719 )
									ret := 0.664407
								if( bbp > 22.6719 )
									ret := -0.153846
						if( bbm > 17.0383 )
							if( Money_Flow_Ratio <= 3.83108 )
								if( Raw_Money_Flow <= 9.48621e+07 )
									ret := 0.555556
								if( Raw_Money_Flow > 9.48621e+07 )
									ret := -0.673203
							if( Money_Flow_Ratio > 3.83108 )
								if( MFI_Low <= 66.6958 )
									ret := 0.745455 // buy
								if( MFI_Low > 66.6958 )
									ret := -0.644444
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_GME_15Min_0c74c986(bearPower, bbm, bbp, bullPower, BBPower_Color, Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


