//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: SNOW_1Min_2CM0_f5d028e6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_2CM0_f5d028e6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_f5d028e6(mf, ad, ad_mf, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Positive_Money_Flow <= 4082.75 )
		if( Negative_Money_Flow <= 137249 )
			if( Positive_Money_Flow_Sum <= 132493 )
				if( mf <= 0.044223 )
					if( ad_mf <= 0.169949 )
						if( MFI <= 15.2363 )
							if( Raw_Money_Flow <= 48306.1 )
								if( mf <= -0.12953 )
									ret := 1.000000 // buy
								if( mf > -0.12953 )
									ret := 0.379310
							if( Raw_Money_Flow > 48306.1 )
								if( mf <= -0.167962 )
									ret := 0.333333
								if( mf > -0.167962 )
									ret := -0.083333
						if( MFI > 15.2363 )
							if( Negative_Money_Flow <= 24271.7 )
								if( Positive_Money_Flow_Sum <= 104728 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 104728 )
									ret := 0.580645
							if( Negative_Money_Flow > 24271.7 )
								if( Negative_Money_Flow <= 91592.9 )
									ret := 0.952941 // buy
								if( Negative_Money_Flow > 91592.9 )
									ret := 0.692308
					if( ad_mf > 0.169949 )
						if( ad_mf <= 0.215191 )
							ret := -0.294118
						if( ad_mf > 0.215191 )
							if( MFI_High <= -66.1161 )
								if( ad_mf <= 0.500155 )
									ret := 0.826087 // buy
								if( ad_mf > 0.500155 )
									ret := 0.400000
							if( MFI_High > -66.1161 )
								if( mf <= -0.292313 )
									ret := 0.000000
								if( mf > -0.292313 )
									ret := 0.700000 // buy
				if( mf > 0.044223 )
					if( Negative_Money_Flow <= 25975.5 )
						if( Money_Flow_Ratio <= 0.319105 )
							if( Money_Flow_Ratio <= 0.131863 )
								ret := 0.230769
							if( Money_Flow_Ratio > 0.131863 )
								if( MFI_Low <= -4.32769 )
									ret := 0.769231 // buy
								if( MFI_Low > -4.32769 )
									ret := 0.875000 // buy
						if( Money_Flow_Ratio > 0.319105 )
							if( Negative_Money_Flow_Sum <= 184923 )
								ret := 0.117647
							if( Negative_Money_Flow_Sum > 184923 )
								ret := -0.176471
					if( Negative_Money_Flow > 25975.5 )
						if( MFI <= 14.1844 )
							ret := -0.500000
						if( MFI > 14.1844 )
							if( MFI_High <= -53.5124 )
								ret := 0.142857
							if( MFI_High > -53.5124 )
								ret := -0.454545
			if( Positive_Money_Flow_Sum > 132493 )
				if( Negative_Money_Flow <= 15731.5 )
					if( MFI <= 59.3283 )
						if( mf <= -0.239441 )
							if( MFI_High <= -64.4128 )
								if( Money_Flow_Ratio <= 0.059538 )
									ret := -0.034483
								if( Money_Flow_Ratio > 0.059538 )
									ret := 0.357143
							if( MFI_High > -64.4128 )
								if( MFI_High <= -33.5534 )
									ret := -0.272727
								if( MFI_High > -33.5534 )
									ret := 0.315789
						if( mf > -0.239441 )
							if( mf <= -0.221689 )
								ret := 0.850000 // buy
							if( mf > -0.221689 )
								if( Positive_Money_Flow_Sum <= 432001 )
									ret := 0.211650
								if( Positive_Money_Flow_Sum > 432001 )
									ret := -0.052632
					if( MFI > 59.3283 )
						if( Positive_Money_Flow_Sum <= 662438 )
							if( Raw_Money_Flow <= 34519.6 )
								if( MFI <= 79.5734 )
									ret := -0.304636
								if( MFI > 79.5734 )
									ret := 0.750000 // buy
							if( Raw_Money_Flow > 34519.6 )
								if( MFI_Low <= 43.4835 )
									ret := -0.954545 // sell
								if( MFI_Low > 43.4835 )
									ret := -0.340909
						if( Positive_Money_Flow_Sum > 662438 )
							if( Positive_Money_Flow_Sum <= 841078 )
								if( MFI_High <= -2.15173 )
									ret := 0.746032 // buy
								if( MFI_High > -2.15173 )
									ret := 0.428571
							if( Positive_Money_Flow_Sum > 841078 )
								if( ad <= 4021.12 )
									ret := -0.176166
								if( ad > 4021.12 )
									ret := 0.500000
				if( Negative_Money_Flow > 15731.5 )
					if( ad_mf <= 0.229596 )
						if( ad_mf <= -0.039433 )
							if( Positive_Money_Flow_Sum <= 9.41017e+07 )
								if( Money_Flow_Ratio <= 1.04558 )
									ret := 0.261932
								if( Money_Flow_Ratio > 1.04558 )
									ret := 0.097561
							if( Positive_Money_Flow_Sum > 9.41017e+07 )
								if( Raw_Money_Flow <= 114835 )
									ret := -0.075000
								if( Raw_Money_Flow > 114835 )
									ret := -0.722222 // sell
						if( ad_mf > -0.039433 )
							if( MFI <= 84.2453 )
								if( MFI_Low <= 58.0382 )
									ret := 0.349599
								if( MFI_Low > 58.0382 )
									ret := 0.618421
							if( MFI > 84.2453 )
								if( Raw_Money_Flow <= 26457 )
									ret := 0.500000
								if( Raw_Money_Flow > 26457 )
									ret := -0.083333
					if( ad_mf > 0.229596 )
						if( MFI <= 0.515916 )
							if( Positive_Money_Flow_Sum <= 225003 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 225003 )
								ret := -0.750000 // sell
						if( MFI > 0.515916 )
							if( Typical_Price <= 163.2 )
								if( MFI <= 42.7236 )
									ret := 0.043839
								if( MFI > 42.7236 )
									ret := 0.247244
							if( Typical_Price > 163.2 )
								if( Raw_Money_Flow <= 80786.1 )
									ret := -0.727273 // sell
								if( Raw_Money_Flow > 80786.1 )
									ret := -0.214286
		if( Negative_Money_Flow > 137249 )
			if( Raw_Money_Flow <= 1.04589e+08 )
				if( MFI_Low <= 28.5336 )
					if( ad_mf <= 10709.1 )
						if( Money_Flow_Ratio <= 0.929396 )
							if( ad <= -22649.7 )
								if( MFI_High <= -77.5577 )
									ret := -0.785714 // sell
								if( MFI_High > -77.5577 )
									ret := 0.202212
							if( ad > -22649.7 )
								if( Negative_Money_Flow_Sum <= 1.37406e+07 )
									ret := -0.002646
								if( Negative_Money_Flow_Sum > 1.37406e+07 )
									ret := 0.082838
						if( Money_Flow_Ratio > 0.929396 )
							if( Positive_Money_Flow_Sum <= 1.93534e+07 )
								if( MFI <= 48.2071 )
									ret := 0.777778 // buy
								if( MFI > 48.2071 )
									ret := 0.320574
							if( Positive_Money_Flow_Sum > 1.93534e+07 )
								if( MFI_Low <= 28.3865 )
									ret := -0.600000
								if( MFI_Low > 28.3865 )
									ret := 0.000000
					if( ad_mf > 10709.1 )
						if( Money_Flow_Ratio <= 0.812206 )
							if( MFI_High <= -48.8251 )
								if( Positive_Money_Flow_Sum <= 1.80137e+07 )
									ret := -0.287009
								if( Positive_Money_Flow_Sum > 1.80137e+07 )
									ret := -0.785714 // sell
							if( MFI_High > -48.8251 )
								if( MFI <= 43.1804 )
									ret := -0.060071
								if( MFI > 43.1804 )
									ret := -0.600000
						if( Money_Flow_Ratio > 0.812206 )
							if( MFI_Low <= 27.2985 )
								if( ad <= 13403.8 )
									ret := 0.000000
								if( ad > 13403.8 )
									ret := 0.755556 // buy
							if( MFI_Low > 27.2985 )
								if( Typical_Price <= 134.722 )
									ret := -0.117647
								if( Typical_Price > 134.722 )
									ret := 0.700000 // buy
				if( MFI_Low > 28.5336 )
					if( Negative_Money_Flow_Sum <= 1.1167e+07 )
						if( Positive_Money_Flow_Sum <= 5.71017e+07 )
							if( MFI_Low <= 52.5459 )
								if( ad_mf <= -1721.43 )
									ret := -0.018317
								if( ad_mf > -1721.43 )
									ret := -0.136203
							if( MFI_Low > 52.5459 )
								if( Raw_Money_Flow <= 4.58129e+06 )
									ret := 0.037069
								if( Raw_Money_Flow > 4.58129e+06 )
									ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 5.71017e+07 )
							if( Negative_Money_Flow_Sum <= 2.5737e+06 )
								ret := 0.545455
							if( Negative_Money_Flow_Sum > 2.5737e+06 )
								if( Raw_Money_Flow <= 259527 )
									ret := -0.473684
								if( Raw_Money_Flow > 259527 )
									ret := -0.833333 // sell
					if( Negative_Money_Flow_Sum > 1.1167e+07 )
						if( Typical_Price <= 137.114 )
							if( Positive_Money_Flow_Sum <= 2.46208e+07 )
								if( Negative_Money_Flow_Sum <= 2.27847e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 2.27847e+07 )
									ret := 0.826087 // buy
							if( Positive_Money_Flow_Sum > 2.46208e+07 )
								if( MFI_Low <= 34.0346 )
									ret := -0.239726
								if( MFI_Low > 34.0346 )
									ret := 0.292071
						if( Typical_Price > 137.114 )
							if( Positive_Money_Flow_Sum <= 5.30838e+07 )
								if( Negative_Money_Flow <= 2.61092e+06 )
									ret := 0.118993
								if( Negative_Money_Flow > 2.61092e+06 )
									ret := -0.258160
							if( Positive_Money_Flow_Sum > 5.30838e+07 )
								if( Typical_Price <= 159.124 )
									ret := -0.543478
								if( Typical_Price > 159.124 )
									ret := 0.411765
			if( Raw_Money_Flow > 1.04589e+08 )
				if( MFI <= 12.5462 )
					ret := 0.454545
				if( MFI > 12.5462 )
					if( Money_Flow_Ratio <= 0.222192 )
						ret := 0.961538 // buy
					if( Money_Flow_Ratio > 0.222192 )
						ret := 0.666667
	if( Positive_Money_Flow > 4082.75 )
		if( Positive_Money_Flow <= 70915.1 )
			if( MFI_Low <= 13.5071 )
				if( ad_mf <= 0.353143 )
					if( MFI <= 16.49 )
						if( MFI <= 8.44048 )
							if( Raw_Money_Flow <= 46049.6 )
								if( MFI_Low <= -18.3837 )
									ret := -0.133333
								if( MFI_Low > -18.3837 )
									ret := 0.616279
							if( Raw_Money_Flow > 46049.6 )
								if( Positive_Money_Flow_Sum <= 476513 )
									ret := -0.777778 // sell
								if( Positive_Money_Flow_Sum > 476513 )
									ret := 0.062500
						if( MFI > 8.44048 )
							if( ad_mf <= -0.068322 )
								if( Raw_Money_Flow <= 86144.4 )
									ret := -0.712329 // sell
								if( Raw_Money_Flow > 86144.4 )
									ret := -0.083333
							if( ad_mf > -0.068322 )
								if( mf <= 0.017997 )
									ret := -0.237624
								if( mf > 0.017997 )
									ret := 0.291667
					if( MFI > 16.49 )
						if( Money_Flow_Ratio <= 0.501769 )
							if( Positive_Money_Flow_Sum <= 148347 )
								if( Negative_Money_Flow_Sum <= 298252 )
									ret := 0.050000
								if( Negative_Money_Flow_Sum > 298252 )
									ret := 0.758621 // buy
							if( Positive_Money_Flow_Sum > 148347 )
								if( ad <= -0.699307 )
									ret := 0.439490
								if( ad > -0.699307 )
									ret := -0.004425
						if( Money_Flow_Ratio > 0.501769 )
							ret := 0.875000 // buy
				if( ad_mf > 0.353143 )
					if( mf <= -0.379224 )
						if( Money_Flow_Ratio <= 0.005873 )
							ret := -0.826087 // sell
						if( Money_Flow_Ratio > 0.005873 )
							if( mf <= -0.643541 )
								if( Positive_Money_Flow <= 15127.5 )
									ret := 0.642857
								if( Positive_Money_Flow > 15127.5 )
									ret := -0.186441
							if( mf > -0.643541 )
								if( ad_mf <= 0.492001 )
									ret := -0.117647
								if( ad_mf > 0.492001 )
									ret := -0.480392
					if( mf > -0.379224 )
						if( Positive_Money_Flow_Sum <= 408781 )
							if( MFI <= 19.9039 )
								if( Money_Flow_Ratio <= 0.156913 )
									ret := -0.896552 // sell
								if( Money_Flow_Ratio > 0.156913 )
									ret := -0.200000
							if( MFI > 19.9039 )
								if( Typical_Price <= 114.268 )
									ret := -0.842105 // sell
								if( Typical_Price > 114.268 )
									ret := -0.958904 // sell
						if( Positive_Money_Flow_Sum > 408781 )
							if( ad_mf <= 165.175 )
								if( mf <= -0.031568 )
									ret := -0.428571
								if( mf > -0.031568 )
									ret := 0.600000
							if( ad_mf > 165.175 )
								if( Negative_Money_Flow <= 222139 )
									ret := -0.728571 // sell
								if( Negative_Money_Flow > 222139 )
									ret := 0.294118
			if( MFI_Low > 13.5071 )
				if( ad_mf <= -2.86954 )
					if( Positive_Money_Flow_Sum <= 242529 )
						if( ad <= -127.954 )
							ret := -0.625000
						if( ad > -127.954 )
							ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 242529 )
						if( ad <= -4491.95 )
							ret := -0.636364
						if( ad > -4491.95 )
							if( Positive_Money_Flow_Sum <= 454107 )
								if( MFI_Low <= 17.1211 )
									ret := -0.176471
								if( MFI_Low > 17.1211 )
									ret := 0.726027 // buy
							if( Positive_Money_Flow_Sum > 454107 )
								if( mf <= 0.030815 )
									ret := -0.041284
								if( mf > 0.030815 )
									ret := 0.403727
				if( ad_mf > -2.86954 )
					if( MFI <= 53.1217 )
						if( MFI_Low <= 23.6011 )
							if( ad_mf <= 73.1708 )
								if( Negative_Money_Flow_Sum <= 2.79072e+06 )
									ret := -0.349515
								if( Negative_Money_Flow_Sum > 2.79072e+06 )
									ret := 0.500000
							if( ad_mf > 73.1708 )
								if( MFI <= 41.096 )
									ret := -0.404255
								if( MFI > 41.096 )
									ret := -0.900000 // sell
						if( MFI_Low > 23.6011 )
							if( mf <= 0.237458 )
								if( Negative_Money_Flow_Sum <= 226149 )
									ret := -0.644068
								if( Negative_Money_Flow_Sum > 226149 )
									ret := -0.106259
							if( mf > 0.237458 )
								if( Positive_Money_Flow_Sum <= 1.05859e+06 )
									ret := 0.400000
								if( Positive_Money_Flow_Sum > 1.05859e+06 )
									ret := -0.600000
					if( MFI > 53.1217 )
						if( mf <= -0.608211 )
							if( Raw_Money_Flow <= 38153.5 )
								if( Negative_Money_Flow_Sum <= 330511 )
									ret := 0.384615
								if( Negative_Money_Flow_Sum > 330511 )
									ret := 0.727273 // buy
							if( Raw_Money_Flow > 38153.5 )
								ret := -0.200000
						if( mf > -0.608211 )
							if( Typical_Price <= 124.305 )
								if( MFI <= 55.4064 )
									ret := -0.507463
								if( MFI > 55.4064 )
									ret := -0.130711
							if( Typical_Price > 124.305 )
								if( mf <= 0.503833 )
									ret := -0.464189
								if( mf > 0.503833 )
									ret := -0.133333
		if( Positive_Money_Flow > 70915.1 )
			if( MFI_High <= -19.8562 )
				if( Typical_Price <= 134.827 )
					if( Negative_Money_Flow_Sum <= 9.82162e+07 )
						if( Raw_Money_Flow <= 6.61707e+06 )
							if( Typical_Price <= 111.588 )
								if( Money_Flow_Ratio <= 0.567225 )
									ret := 0.260417
								if( Money_Flow_Ratio > 0.567225 )
									ret := 0.057482
							if( Typical_Price > 111.588 )
								if( Raw_Money_Flow <= 4.46858e+06 )
									ret := -0.007168
								if( Raw_Money_Flow > 4.46858e+06 )
									ret := -0.234146
						if( Raw_Money_Flow > 6.61707e+06 )
							if( MFI_High <= -46.1945 )
								if( Positive_Money_Flow <= 7.83103e+06 )
									ret := 0.666667
								if( Positive_Money_Flow > 7.83103e+06 )
									ret := -0.531915
							if( MFI_High > -46.1945 )
								if( mf <= 0.177619 )
									ret := 0.286307
								if( mf > 0.177619 )
									ret := 0.838710 // buy
					if( Negative_Money_Flow_Sum > 9.82162e+07 )
						if( Money_Flow_Ratio <= 0.178429 )
							if( Money_Flow_Ratio <= 0.129326 )
								if( Positive_Money_Flow_Sum <= 2.33084e+06 )
									ret := -0.400000
								if( Positive_Money_Flow_Sum > 2.33084e+06 )
									ret := 0.230769
							if( Money_Flow_Ratio > 0.129326 )
								if( Typical_Price <= 112.891 )
									ret := 0.933333 // buy
								if( Typical_Price > 112.891 )
									ret := 0.458333
						if( Money_Flow_Ratio > 0.178429 )
							if( Positive_Money_Flow_Sum <= 4.67164e+07 )
								if( MFI <= 15.7008 )
									ret := -0.615385
								if( MFI > 15.7008 )
									ret := -0.926829 // sell
							if( Positive_Money_Flow_Sum > 4.67164e+07 )
								if( Money_Flow_Ratio <= 0.551098 )
									ret := 0.099010
								if( Money_Flow_Ratio > 0.551098 )
									ret := -0.826087 // sell
				if( Typical_Price > 134.827 )
					if( mf <= 0.008909 )
						if( Positive_Money_Flow <= 1.2224e+06 )
							if( MFI_Low <= 17.4337 )
								if( Typical_Price <= 157.652 )
									ret := -0.180363
								if( Typical_Price > 157.652 )
									ret := 0.058824
							if( MFI_Low > 17.4337 )
								if( MFI_High <= -31.1966 )
									ret := 0.175294
								if( MFI_High > -31.1966 )
									ret := -0.047096
						if( Positive_Money_Flow > 1.2224e+06 )
							if( MFI_Low <= 29.3886 )
								if( Money_Flow_Ratio <= 0.867898 )
									ret := -0.153789
								if( Money_Flow_Ratio > 0.867898 )
									ret := -0.622047
							if( MFI_Low > 29.3886 )
								if( Positive_Money_Flow <= 2.89562e+06 )
									ret := -0.173653
								if( Positive_Money_Flow > 2.89562e+06 )
									ret := 0.337748
					if( mf > 0.008909 )
						if( Positive_Money_Flow_Sum <= 3.28674e+06 )
							if( MFI <= 58.285 )
								if( MFI <= 41.6961 )
									ret := -0.486842
								if( MFI > 41.6961 )
									ret := -0.174051
							if( MFI > 58.285 )
								if( MFI_High <= -20.7484 )
									ret := -0.978261 // sell
								if( MFI_High > -20.7484 )
									ret := -0.400000
						if( Positive_Money_Flow_Sum > 3.28674e+06 )
							if( Negative_Money_Flow_Sum <= 3.66995e+06 )
								if( MFI_High <= -26.8532 )
									ret := -0.117647
								if( MFI_High > -26.8532 )
									ret := 0.457627
							if( Negative_Money_Flow_Sum > 3.66995e+06 )
								if( MFI_Low <= 6.56329 )
									ret := 0.277778
								if( MFI_Low > 6.56329 )
									ret := -0.160000
			if( MFI_High > -19.8562 )
				if( Typical_Price <= 135.025 )
					if( ad_mf <= 8541.3 )
						if( ad_mf <= -1.62779 )
							if( Positive_Money_Flow <= 387197 )
								if( Money_Flow_Ratio <= 1.64706 )
									ret := -0.053571
								if( Money_Flow_Ratio > 1.64706 )
									ret := 0.333929
							if( Positive_Money_Flow > 387197 )
								if( Negative_Money_Flow_Sum <= 1.00734e+07 )
									ret := 0.050108
								if( Negative_Money_Flow_Sum > 1.00734e+07 )
									ret := 0.292500
						if( ad_mf > -1.62779 )
							if( Negative_Money_Flow_Sum <= 357387 )
								if( MFI_High <= -15.4379 )
									ret := 0.480000
								if( MFI_High > -15.4379 )
									ret := -0.340000
							if( Negative_Money_Flow_Sum > 357387 )
								if( ad <= 2170.12 )
									ret := 0.098280
								if( ad > 2170.12 )
									ret := -0.034428
					if( ad_mf > 8541.3 )
						if( Raw_Money_Flow <= 5.74741e+07 )
							if( Money_Flow_Ratio <= 23.7338 )
								if( Negative_Money_Flow_Sum <= 1.06164e+07 )
									ret := 0.051268
								if( Negative_Money_Flow_Sum > 1.06164e+07 )
									ret := 0.336091
							if( Money_Flow_Ratio > 23.7338 )
								if( Positive_Money_Flow_Sum <= 1.37208e+07 )
									ret := -0.230769
								if( Positive_Money_Flow_Sum > 1.37208e+07 )
									ret := 0.730337 // buy
						if( Raw_Money_Flow > 5.74741e+07 )
							if( Positive_Money_Flow_Sum <= 1.96548e+08 )
								ret := -0.818182 // sell
							if( Positive_Money_Flow_Sum > 1.96548e+08 )
								ret := -1.000000 // sell
				if( Typical_Price > 135.025 )
					if( ad_mf <= -1967.56 )
						if( ad <= -10660.5 )
							if( Typical_Price <= 164.022 )
								if( Positive_Money_Flow_Sum <= 5.46655e+07 )
									ret := 0.415385
								if( Positive_Money_Flow_Sum > 5.46655e+07 )
									ret := 0.821429 // buy
							if( Typical_Price > 164.022 )
								ret := -0.714286 // sell
						if( ad > -10660.5 )
							if( Negative_Money_Flow <= 22511.6 )
								if( Positive_Money_Flow <= 1.04894e+07 )
									ret := 0.095469
								if( Positive_Money_Flow > 1.04894e+07 )
									ret := 1.000000 // buy
							if( Negative_Money_Flow > 22511.6 )
								if( ad_mf <= -3310.13 )
									ret := 0.555556
								if( ad_mf > -3310.13 )
									ret := 0.857143 // buy
					if( ad_mf > -1967.56 )
						if( Money_Flow_Ratio <= 1.82273 )
							if( ad <= 10079.9 )
								if( mf <= -0.380676 )
									ret := 0.875000 // buy
								if( mf > -0.380676 )
									ret := -0.066763
							if( ad > 10079.9 )
								if( ad <= 30434.8 )
									ret := 0.395522
								if( ad > 30434.8 )
									ret := -0.260870
						if( Money_Flow_Ratio > 1.82273 )
							if( Typical_Price <= 171.266 )
								if( Negative_Money_Flow_Sum <= 7.68278e+06 )
									ret := -0.078648
								if( Negative_Money_Flow_Sum > 7.68278e+06 )
									ret := -0.341394
							if( Typical_Price > 171.266 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_SNOW_1Min_f5d028e6(mf, ad, ad_mf, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


